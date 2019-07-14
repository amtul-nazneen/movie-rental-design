/**
 * 
 */
package app.transaction.rental;

import app.factory.strategy.Strategy;
import app.factory.strategy.StrategyFactory;
import app.item.parent.Item;
import app.transaction.CartItem;

/**
 * @author amtul.nazneen
 */
public class Rental extends CartItem {
    Integer daysRented;

    Double totalAmount;
    Strategy strategy;

    public Rental(Integer daysRented, Item rentedItem) {
	super(rentedItem);
	this.daysRented = daysRented;
    }

    public Integer getDaysRented() {
	return daysRented;
    }

    public void setDaysRented(Integer daysRented) {
	this.daysRented = daysRented;
    }

    public Strategy getStrategy() {
	return strategy;
    }

    public void setStrategy(Strategy strategy) {
	this.strategy = strategy;
    }

    public Double getTotalAmount() {
	return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
	this.totalAmount = totalAmount;
    }

    public Integer getUpdatedFrequentRenterPoints() {
	StrategyFactory strategyFactory = new StrategyFactory();
	this.setStrategy(strategyFactory.getStrategy(this));
	Integer calculatedFpr = null;
	if (this.getStrategy() != null) {
	    calculatedFpr = this.getStrategy().calculateFrequentRentalPoints(this);
	} else {
	    System.out.println("strategy null");
	}
	return calculatedFpr;
    }

    public Double getCalculatedRentalItemAmount() {
	Double amount = null;
	if (this.getStrategy() != null) {
	    amount = this.getStrategy().calculateRentalPrice(this);
	}
	this.setTotalAmount(amount);
	return amount;
    }
}
