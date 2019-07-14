/**
 * 
 */
package app.factory.strategy.dvd;

import app.common.ItemFPR;
import app.common.ItemRentPrice;
import app.common.ItemSalePrice;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

/**
 * @author amtul.nazneen
 */
public class DVD256MBStrategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.DVD_256;
	System.out.println("Frequent Renter Points for DVD-256: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double amount = ItemRentPrice.DVD_256;
	System.out.println("Rental Amount for DVD-256: " + amount);
	return amount;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = ItemSalePrice.DVD_256;
	System.out.println("Sale Amount for DVD-256: " + amount);
	return amount;
    }
}
