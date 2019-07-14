/**
 * 
 */
package app.factory.strategy.movie;

import app.common.ItemFPR;
import app.factory.strategy.Strategy;
import app.transaction.rental.Rental;
import app.transaction.sale.Sale;

/**
 * @author amtul.nazneen
 */
public class NewReleaseStrategy extends Strategy {
    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	int fpr = ItemFPR.MOVIE_NEW_RELEASE;
	System.out.println("Frequent Renter Points for Movie-NewRelease: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {
	Double baseAmount = 3.0;
	Double overdueAmount = 0.0;
	Integer overdueDays = 0;
	Integer daysRented = rental.getDaysRented();
	Double total = 0.0;
	total = baseAmount + (daysRented - overdueDays) * overdueAmount;
	System.out.println("Rental Amount for Movie-NewRelease: " + total);

	return total;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = 2.5;
	System.out.println("Sale Amount for Movie-NewRelease: " + amount);
	return amount;
    }
}
