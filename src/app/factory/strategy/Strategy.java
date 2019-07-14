package app.factory.strategy;

import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

/**
 * @author amtul.nazneen
 */
public abstract class Strategy {

    public abstract int calculateFrequentRentalPoints(Rental rental);

    public abstract Double calculateRentalPrice(Rental rental);

    public abstract Double calculatePurchasePrice(Sale sale);

}
