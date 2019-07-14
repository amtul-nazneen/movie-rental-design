package app.factory.decorator.coupons;

import app.transaction.Transaction;

public abstract class Decorator {
    public Transaction transaction;

    public Decorator(Transaction transaction) {
	this.transaction = transaction;
    }

    public void applyPromotions(Transaction transaction) {
	transaction.processTransaction();
    }
}
