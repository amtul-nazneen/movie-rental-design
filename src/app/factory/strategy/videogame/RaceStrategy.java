package app.factory.strategy.videogame;

import app.common.ItemFPR;
import app.common.ItemRentPrice;
import app.common.ItemSalePrice;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class RaceStrategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.VIDEOGAME_RACE;
	System.out.println("Frequent Renter Points for VideoGames-Race: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double amount = ItemRentPrice.VIDEOGAME_RACE;
	System.out.println("Rental Amount for : VideoGames-Race" + amount);
	return amount;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = ItemSalePrice.VIDEOGAME_RACE;
	System.out.println("Sale Amount for : VideoGames-Race" + amount);
	return amount;
    }

}
