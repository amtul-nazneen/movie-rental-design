package app.factory.strategy.dvd;

import app.common.ItemFPR;
import app.common.ItemRentPrice;
import app.common.ItemSalePrice;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class DVD512MBStrategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.DVD_512;
	System.out.println("Frequent Renter Points for DVD-512: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double amount = ItemRentPrice.DVD_512;
	System.out.println("Rental Amount for DVD-512: " + amount);
	return amount;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = ItemSalePrice.DVD_512;
	System.out.println("Sale Amount for DVD-512: " + amount);
	return amount;
    }

}
