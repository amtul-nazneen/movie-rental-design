package app.item.children;

import app.common.ItemCode;
import app.item.parent.Item;

public class Book extends Item {
    public static final String THRILLER = "THRILLER";
    public static final String FICTION = "FICTION";

    public String genre;

    public Book(String genre) {
	super(ItemCode.BOOK);
	this.genre = genre;
    }

    public String getGenre() {
	return genre;
    }

    public void setGenre(String genre) {
	this.genre = genre;
    }

}
