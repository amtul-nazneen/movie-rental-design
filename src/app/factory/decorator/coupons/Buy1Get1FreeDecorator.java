/**
 * 
 */
package app.factory.decorator.coupons;

import java.util.Scanner;

import app.transaction.Transaction;

/**
 * @author amtul.nazneen
 */
public class Buy1Get1FreeDecorator extends Decorator {

    public Buy1Get1FreeDecorator(Transaction transaction) {
	super(transaction);
    }

    @Override
    public void applyPromotions(Transaction transaction) {
	transaction.processTransaction();
	applyCoupon(transaction);
    }

    public void applyCoupon(Transaction transaction) {
	System.out.println(
		"\n *** Congratulations! You have qualified for the Buy1 and Get1 free coupon on your rental items. **");
	int total = transaction.getRentItems().size();
	int free = total / 2;
	System.out.println("You have bought " + total + " items. Pick " + free + " items to avail for free!");
	System.out.println("\nYour items in the cart are: ");
	int i = 1;
	double priceToReduce = 0.0;
	while (i <= total) {
	    System.out.print(" " + i + ": " + transaction.getRentItems().get(i - 1).getItem().getCode());
	    if (i <= 5)
		priceToReduce += transaction.getRentItems().get(i - 1).getTotalAmount();
	    i++;
	}
	Scanner in = new Scanner(System.in);
	System.out.println();
	System.out.println("\nEnter your choice of items to pick for free: ");
	String choice = in.next();
	System.out.println("\nThank you! Successfully applied coupon for the selected items!");
	in.close();
	double beforePrice = transaction.getTotalRentAmount();
	double afterPrice = beforePrice - priceToReduce;
	transaction.setTotalRentAmount(afterPrice);
	System.out.println("Total Amount for Rental Items after coupon: " + transaction.getTotalRentAmount());

    }

}
