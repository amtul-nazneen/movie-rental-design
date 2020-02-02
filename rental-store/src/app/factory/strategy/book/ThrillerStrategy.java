package app.factory.strategy.book;

import app.common.ItemFPR;
import app.common.ItemRentPrice;
import app.common.ItemSalePrice;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class ThrillerStrategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.BOOK_THRILLER;
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double amount = ItemRentPrice.BOOK_THRILLER;
	return amount;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = ItemSalePrice.BOOK_THRILLER;
	return amount;
    }

}
