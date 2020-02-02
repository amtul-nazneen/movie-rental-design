package app.factory.strategy.book;

import app.common.ItemFPR;
import app.common.ItemRentPrice;
import app.common.ItemSalePrice;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class FictionStrategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.BOOK_FICTION;
	System.out.println("Frequent Renter Points for Book-Fiction: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double amount = ItemRentPrice.BOOK_FICTION;
	System.out.println("Rental Amount for Book-Fiction: " + amount);
	return amount;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = ItemSalePrice.BOOK_FICTION;
	System.out.println("Sale Amount for Book-Fiction: " + amount);
	return amount;
    }

}
