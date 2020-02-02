package app.factory.strategy.ps4;

import app.common.ItemFPR;
import app.common.ItemRentPrice;
import app.common.ItemSalePrice;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class PS4Version1Strategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.PS4_V1;
	System.out.println("Frequent Renter Points for PS4-Version1: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double amount = ItemRentPrice.PS4_V1;
	System.out.println("Rental Amount for PS4-Version1: " + amount);
	return amount;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = ItemSalePrice.PS4_V1;
	System.out.println("Sale Amount for PS4-Version1: " + amount);
	return amount;
    }

}
