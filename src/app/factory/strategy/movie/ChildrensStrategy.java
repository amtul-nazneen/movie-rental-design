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
public class ChildrensStrategy extends Strategy {

    @Override
    public int calculateFrequentRentalPoints(Rental rental) {
	int fpr = ItemFPR.MOVIE_REGULAR;
	System.out.println("Frequent Renter Points for Movie-Children: " + fpr);
	return fpr;
    }

    @Override
    public Double calculateRentalPrice(Rental rental) {

	Double baseAmount = 1.5;
	Double overdueAmount = 1.5;
	Integer overdueDays = 3;
	Integer daysRented = rental.getDaysRented();
	Double total = 0.0;
	total = baseAmount + (daysRented - overdueDays) * overdueAmount;
	System.out.println("Rental Amount for Movie-Children: " + total);
	return total;
    }

    @Override
    public Double calculatePurchasePrice(Sale sale) {
	Double amount = 1.0;
	System.out.println("Sale Amount for Movie-Children: " + amount);
	return amount;
    }

}
