/**
 * 
 */
package app;

import app.common.RunnerHelper;
import app.customer.Customer;
import app.transaction.Transaction;

/**
 * @author amtul.nazneen
 */
public class Runner {
    public static void main(String[] args) {
	Customer customer = RunnerHelper.createCustomer("Jack", 25);
	Transaction transaction = RunnerHelper.beginTransaction(customer);

	RunnerHelper.addRentOrSellItemsToCart(transaction);

	int fpr = customer.getUpdatedFrequentRenterPoints(transaction);
	double rentalItemsAmount = customer.getRentalItemsTotalAmount(transaction);
	double saleItemsAmount = customer.getSaleItemsTotalAmount(transaction);

	RunnerHelper.updateTransactionWithTotalAmountAndFPR(transaction, fpr, saleItemsAmount, rentalItemsAmount);
	/**
	 * to test for 50% off case with the given data set
	 * RunnerHelper.updateTransactionWithTotalAmountAndFPR(transaction, fpr+10,
	 * saleItemsAmount, rentalItemsAmount);
	 */
	/**
	 * to test for 10$ off case with the given data set%/
	 * RunnerHelper.updateTransactionWithTotalAmountAndFPR(transaction, fpr-10,
	 * saleItemsAmount, rentalItemsAmount);
	 */
	RunnerHelper.applyPromotionsIfApplicable(transaction);
	System.out.println("Thank you!");

    }

}
