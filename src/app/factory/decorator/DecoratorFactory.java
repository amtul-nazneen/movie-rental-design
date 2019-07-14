/**
 * 
 */
package app.factory.decorator;

import app.factory.decorator.coupons.Buy1Get1FreeDecorator;
import app.factory.decorator.coupons.Decorator;
import app.factory.decorator.coupons.Deduct10Decorator;
import app.factory.decorator.coupons.HalfPriceOffDecorator;
import app.transaction.Transaction;

/**
 * @author amtul.nazneen
 */
public class DecoratorFactory {
    public Decorator getDecorator(Transaction transaction) {
	Decorator decorator = null;
	Integer fpr = transaction.getOwner().getFrequentRenterPoints();
	{
	    if (fpr >= 20 && fpr < 30) {
		decorator = new Buy1Get1FreeDecorator(transaction);
	    } else if (fpr >= 30 && fpr < 40) {
		decorator = new HalfPriceOffDecorator(transaction);
	    } else if (fpr >= 10 && fpr < 20) {
		decorator = new Deduct10Decorator(transaction);
	    }
	}
	return decorator;
    }
}
