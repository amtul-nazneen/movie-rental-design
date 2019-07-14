package app.factory.strategy.movie;

import app.common.ItemFPR;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

public class RegularStrategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	Integer fpr = ItemFPR.MOVIE_REGULAR;
	System.out.println("Frequent Renter Points for Movie-Regular: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double baseAmount = 2.0;
	Double overdueAmount = 1.5;
	Integer overdueDays = 2;
	Integer daysRented = rental.getDaysRented();
	Double total = 0.0;
	total = baseAmount + (daysRented - overdueDays) * overdueAmount;
	System.out.println("Rental Amount for Movie-Regular: " + total);
	return total;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = 1.0;
	System.out.println("Sale Amount for Movie-Regular: " + amount);
	return amount;
    }

}
