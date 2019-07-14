/**
 * 
 */
package app.transaction;

import java.util.ArrayList;

import app.customer.Customer;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

/**
 * @author amtul.nazneen
 */
public class Transaction {
    ArrayList<Rental> rentItems;
    ArrayList<Sale> saleItems;
    Double totalRentAmount;
    Double totalSaleAmount;
    Customer owner;
    private static Transaction transactionInstance = null;

    public Customer getOwner() {
	return owner;
    }

    public void setOwner(Customer owner) {
	this.owner = owner;
    }

    public ArrayList<Rental> getRentItems() {
	return rentItems;
    }

    public void setRentItems(ArrayList<Rental> rentItems) {
	if (rentItems != null && !rentItems.isEmpty())
	    this.rentItems = rentItems;
    }

    public ArrayList<Sale> getSaleItems() {
	return saleItems;
    }

    public void setSaleItems(ArrayList<Sale> saleItems) {
	if (saleItems != null && !saleItems.isEmpty())
	    this.saleItems = saleItems;
    }

    public Double getTotalRentAmount() {
	return totalRentAmount;
    }

    public void setTotalRentAmount(Double totalRentAmount) {
	this.totalRentAmount = totalRentAmount;
    }

    public Double getTotalSaleAmount() {
	return totalSaleAmount;
    }

    public void setTotalSaleAmount(Double totalSaleAmount) {
	this.totalSaleAmount = totalSaleAmount;
    }

    public void processTransaction() {
	System.out.println("\nCheck out in progress..");
    }

    public static Transaction getInstance() {
	if (transactionInstance == null)
	    transactionInstance = new Transaction();

	return transactionInstance;
    }
}
