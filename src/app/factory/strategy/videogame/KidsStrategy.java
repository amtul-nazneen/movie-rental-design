package app.factory.strategy.videogame;

import app.common.ItemFPR;
import app.common.ItemRentPrice;
import app.common.ItemSalePrice;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class KidsStrategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.VIDEOGAME_KIDS;
	System.out.println("Frequent Renter Points for VideoGames-Kids: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double amount = ItemRentPrice.VIDEOGAME_KIDS;
	System.out.println("Rental Amount for VideGames-kids: " + amount);
	return amount;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = ItemSalePrice.VIDEOGAME_KIDS;
	System.out.println("Sale Amount for VideoGame-kids: " + amount);
	return amount;
    }

}
