/**
 * 
 */
package app.customer;

import app.transaction.Transaction;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

/**
 * @author amtul.nazneen
 */
public class Customer {

    String name;
    Integer frequentRenterPoints;
    Integer age;

    public Customer(String name, Integer age) {
	this.name = name;
	this.age = age;
	this.frequentRenterPoints = 0;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public Integer getFrequentRenterPoints() {
	return frequentRenterPoints;
    }

    public void setFrequentRenterPoints(Integer frequentRenterPoints) {
	this.frequentRenterPoints = frequentRenterPoints;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getUpdatedFrequentRenterPoints(Transaction cartItems) {
	Integer updatedFpr = this.getFrequentRenterPoints();
	for (Rental rental : cartItems.getRentItems()) {
	    updatedFpr += rental.getUpdatedFrequentRenterPoints();
	}
	System.out.println("\n **** Total Frequent Renter Points earned for this transaction: " + updatedFpr);
	return updatedFpr;
    }

    public Double getRentalItemsTotalAmount(Transaction cartItems) {
	Double totalAmount = 0.0;
	for (Rental rental : cartItems.getRentItems()) {
	    totalAmount += rental.getCalculatedRentalItemAmount();
	}
	System.out.println("\n **** Total Amount for Rental Items in this transaction: " + totalAmount);
	return totalAmount;
    }

    public Double getSaleItemsTotalAmount(Transaction cartItems) {
	Double totalAmount = 0.0;
	for (Sale sale : cartItems.getSaleItems()) {
	    totalAmount += sale.getCalculatedSaleItemAmount();
	}
	System.out.println("\n **** Total Amount for Sale Items in this transaction: " + totalAmount);
	return totalAmount;
    }

}
