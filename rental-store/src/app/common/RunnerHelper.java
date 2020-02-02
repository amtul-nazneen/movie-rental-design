package app.common;

import java.util.ArrayList;

import app.customer.Customer;
import app.factory.decorator.DecoratorFactory;
import app.factory.decorator.coupons.Decorator;
import app.item.children.Book;
import app.item.children.DVD;
import app.item.children.Movie;
import app.item.children.PS4;
import app.item.children.VideoGame;
import app.item.children.Xbox;
import app.transaction.Transaction;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class RunnerHelper {
    public static void addRentOrSellItemsToCart(Transaction transaction) {
	System.out.println("Select the items to add to cart for renting or selling.");
	System.out.println("Added items to cart successfully.\n");
	ArrayList<Rental> rent = new ArrayList<Rental>();
	ArrayList<Sale> sale = new ArrayList<Sale>();

	/** items added to cart for renting **/
	Movie movie1 = new Movie("Avengers", Movie.NEW_RELEASE);
	Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
	Movie movie3 = new Movie("Gladiator", Movie.REGULAR);
	DVD dvd1 = new DVD(256);
	DVD dvd2 = new DVD(512);
	DVD dvd3 = new DVD(1024);
	Book book1 = new Book(Book.FICTION);
	Book book2 = new Book(Book.THRILLER);
	PS4 ps41 = new PS4(1);
	PS4 ps42 = new PS4(2);
	VideoGame videoGame1 = new VideoGame(VideoGame.RACE);
	VideoGame videoGame2 = new VideoGame(VideoGame.KIDS);
	Xbox xbox1 = new Xbox(2004);
	Xbox xbox2 = new Xbox(2006);

	/** items added to cart for selling **/
	Movie movie001 = new Movie("Frozen", Movie.CHILDRENS);
	DVD dvd001 = new DVD(1024);
	Book book001 = new Book(Book.FICTION);

	/** add items for rent in cart **/
	rent.add(new Rental(4, movie1));
	rent.add(new Rental(4, movie2));
	rent.add(new Rental(4, movie3));
	rent.add(new Rental(4, dvd1));
	rent.add(new Rental(4, dvd2));
	rent.add(new Rental(4, dvd3));
	rent.add(new Rental(4, book1));
	rent.add(new Rental(4, book2));
	rent.add(new Rental(4, ps41));
	rent.add(new Rental(4, ps42));
	rent.add(new Rental(4, videoGame1));
	rent.add(new Rental(4, videoGame2));
	rent.add(new Rental(4, xbox1));
	rent.add(new Rental(4, xbox2));

	/** add items for sale in cart **/
	sale.add(new Sale(movie001));
	sale.add(new Sale(dvd001));
	sale.add(new Sale(book001));

	/** updated transaction with rent and sale items **/
	transaction.setRentItems(rent);
	transaction.setSaleItems(sale);
    }

    public static void updateTransactionWithTotalAmountAndFPR(Transaction transaction, Integer fpr, Double saleAmount,
	    Double rentalAmount) {
	System.out.println("fpr: " + fpr);
	transaction.getOwner().setFrequentRenterPoints(fpr);
	transaction.setTotalRentAmount(rentalAmount);
	transaction.setTotalSaleAmount(saleAmount);
    }

    public static void applyPromotionsIfApplicable(Transaction transaction) {
	DecoratorFactory df = new DecoratorFactory();
	Decorator d = df.getDecorator(transaction);
	d.applyPromotions(transaction);
    }

    public static Customer createCustomer(String name, Integer age) {
	return new Customer(name, age);
    }

    public static Transaction beginTransaction(Customer customer) {
	Transaction.getInstance().setOwner(customer);
	return Transaction.getInstance();
    }
}
