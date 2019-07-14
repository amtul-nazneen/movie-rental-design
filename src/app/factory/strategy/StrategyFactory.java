/**
 * 
 */
package app.factory.strategy;

import app.common.ItemCode;
import app.item.parent.Item;
import app.transaction.CartItem;

/**
 * @author amtul.nazneen
 */
public class StrategyFactory {

    @SuppressWarnings("unused")
    public Strategy getStrategy(CartItem cartItem) {
	Strategy strategy = null;
	Item item = cartItem.getItem();
	if (cartItem == null) {
	    strategy = null;
	} else {
	    if (ItemCode.MOVIE.equalsIgnoreCase(item.getCode())) {
		strategy = StrategyFactoryHelper.getMovieStrategy(item, cartItem);
	    } else if (ItemCode.DVD.equalsIgnoreCase(item.getCode())) {
		strategy = StrategyFactoryHelper.getDVDStrategy(item, cartItem);
	    } else if (ItemCode.BOOK.equalsIgnoreCase(item.getCode())) {
		strategy = StrategyFactoryHelper.getBookStrategy(item, cartItem);
	    } else if (ItemCode.PS4.equalsIgnoreCase(item.getCode())) {
		strategy = StrategyFactoryHelper.getPS4Strategy(item, cartItem);
	    } else if (ItemCode.VIDEO_GAME.equalsIgnoreCase(item.getCode())) {
		strategy = StrategyFactoryHelper.getVideoGameStrategy(item, cartItem);
	    } else if (ItemCode.XBOX.equalsIgnoreCase(item.getCode())) {
		strategy = StrategyFactoryHelper.getXboxStrategy(item, cartItem);
	    }
	}
	return strategy;
    }
}
