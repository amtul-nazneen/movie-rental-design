/**
 * 
 */
package app.factory.strategy;

import app.factory.strategy.book.FictionStrategy;
import app.factory.strategy.book.ThrillerStrategy;
import app.factory.strategy.dvd.DVD1024MBStrategy;
import app.factory.strategy.dvd.DVD256MBStrategy;
import app.factory.strategy.dvd.DVD512MBStrategy;
import app.factory.strategy.movie.ChildrensStrategy;
import app.factory.strategy.movie.NewReleaseStrategy;
import app.factory.strategy.movie.RegularStrategy;
import app.factory.strategy.ps4.PS4Version1Strategy;
import app.factory.strategy.ps4.PS4Version2Strategy;
import app.factory.strategy.videogame.KidsStrategy;
import app.factory.strategy.videogame.RaceStrategy;
import app.factory.strategy.xbox.Model2004Strategy;
import app.factory.strategy.xbox.Model2006Strategy;
import app.item.children.Book;
import app.item.children.DVD;
import app.item.children.Movie;
import app.item.children.PS4;
import app.item.children.VideoGame;
import app.item.children.Xbox;
import app.item.parent.Item;
import app.transaction.CartItem;
import app.transaction.rental.Rental;

/**
 * @author amtul.nazneen
 */
public class StrategyFactoryHelper {

    public static Strategy getMovieStrategy(Item item, CartItem cartItem) {
	Strategy strategy = null;
	Movie movie = (Movie) item;
	if (Movie.NEW_RELEASE.equals(movie.getType())) {
	    if (cartItem instanceof Rental) {
		Rental rental = (Rental) cartItem;
		if (rental.getDaysRented() != 0 && rental.getDaysRented() > 1)
		    strategy = new NewReleaseStrategy();
		else
		    strategy = new RegularStrategy();
	    } else {
		strategy = new NewReleaseStrategy();
	    }
	}
	if (Movie.CHILDRENS.equals(movie.getType())) {
	    strategy = new ChildrensStrategy();
	}
	if (Movie.REGULAR.equals(movie.getType())) {
	    strategy = new RegularStrategy();
	}
	return strategy;
    }

    public static Strategy getDVDStrategy(Item item, CartItem cartItem) {
	Strategy strategy = null;
	DVD dvd = (DVD) item;
	if (DVD.DVD_256.equals(dvd.getCapacity())) {
	    strategy = new DVD256MBStrategy();
	} else if (DVD.DVD_512.equals(dvd.getCapacity())) {
	    strategy = new DVD512MBStrategy();
	}
	if (DVD.DVD_1024.equals(dvd.getCapacity())) {
	    strategy = new DVD1024MBStrategy();
	}
	return strategy;
    }

    public static Strategy getBookStrategy(Item item, CartItem cartItem) {
	Strategy strategy = null;
	Book book = (Book) item;
	if (Book.FICTION.equals(book.getGenre())) {
	    strategy = new FictionStrategy();
	} else if (Book.THRILLER.equals(book.getGenre())) {
	    strategy = new ThrillerStrategy();
	}
	return strategy;
    }

    public static Strategy getPS4Strategy(Item item, CartItem cartItem) {
	Strategy strategy = null;
	PS4 ps4 = (PS4) item;
	if (PS4.V1.equals(ps4.getVersion())) {
	    strategy = new PS4Version1Strategy();
	} else if (PS4.V2.equals(ps4.getVersion())) {
	    strategy = new PS4Version2Strategy();
	}
	return strategy;
    }

    public static Strategy getVideoGameStrategy(Item item, CartItem cartItem) {
	Strategy strategy = null;
	VideoGame vg = (VideoGame) item;
	if (VideoGame.KIDS.equals(vg.getType())) {
	    strategy = new KidsStrategy();
	} else if (VideoGame.RACE.equals(vg.getType())) {
	    strategy = new RaceStrategy();
	}
	return strategy;
    }

    public static Strategy getXboxStrategy(Item item, CartItem cartItem) {
	Strategy strategy = null;
	Xbox xbox = (Xbox) item;
	if (Xbox.XBOX_2004.equals(xbox.getModel())) {
	    strategy = new Model2004Strategy();
	} else if (Xbox.XBOX_2006.equals(xbox.getModel())) {
	    strategy = new Model2006Strategy();
	}
	return strategy;
    }

}
