package app.factory.decorator.coupons;

import app.transaction.Transaction;

public class Deduct10Decorator extends Decorator {

    public Deduct10Decorator(Transaction transaction) {
	super(transaction);
    }

    @Override
    public void applyPromotions(Transaction transaction) {
	transaction.processTransaction();
	applyCoupon(transaction);
    }

    public void applyCoupon(Transaction transaction) {
	System.out.println("Congratulations! You have won a 10$ off coupon on your rental items purchase!");
	double priceBefore = transaction.getTotalRentAmount();
	System.out.println("Price Before: " + priceBefore);
	double priceAfter = priceBefore - 10;
	System.out.println("Price After: " + priceAfter);
	transaction.setTotalRentAmount(priceAfter);
    }

}
