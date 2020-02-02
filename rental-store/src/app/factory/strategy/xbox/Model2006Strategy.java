package app.factory.strategy.xbox;

import app.common.ItemFPR;
import app.common.ItemRentPrice;
import app.common.ItemSalePrice;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class Model2006Strategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.XBOX_M2006;
	System.out.println("Frequent Renter Points for Xbox-Model2006: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double amount = ItemRentPrice.XBOX_M2006;
	System.out.println("Rental Amount for Xbox-Model2006: " + amount);
	return amount;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = ItemSalePrice.XBOX_M2006;
	System.out.println("Sale Amount for Xbox-Model2006: " + amount);
	return amount;
    }

}
