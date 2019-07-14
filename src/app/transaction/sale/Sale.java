/**
 * 
 */
package app.transaction.sale;

import app.factory.strategy.Strategy;
import app.factory.strategy.StrategyFactory;
import app.item.parent.Item;
import app.transaction.CartItem;

/**
 * @author amtul.nazneen
 */
public class Sale extends CartItem {
    Double totalAmount;
    Strategy strategy;

    public Sale(Item saleItem) {
	super(saleItem);
    }

    public Double getTotalAmount() {
	return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
	this.totalAmount = totalAmount;
    }

    public Strategy getStrategy() {
	return strategy;
    }

    public void setStrategy(Strategy strategy) {
	this.strategy = strategy;
    }

    public Double getCalculatedSaleItemAmount() {
	StrategyFactory strategyFactory = new StrategyFactory();
	this.setStrategy(strategyFactory.getStrategy(this));
	Double amount = null;
	if (this.getStrategy() != null) {
	    amount = this.getStrategy().calculatePurchasePrice(this);
	}
	this.setTotalAmount(amount);
	return amount;
    }
}
