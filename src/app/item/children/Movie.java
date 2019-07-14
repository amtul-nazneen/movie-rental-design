package app.item.children;

import app.common.ItemCode;
import app.item.parent.Item;

/**
 * @author amtul.nazneen
 */
public class Movie extends Item {
    public static final String CHILDRENS = "CHILDREN";
    public static final String REGULAR = "REGULAR";
    public static final String NEW_RELEASE = "NEW_RELEASE";

    public String type;

    public Movie(String name, String type) {
	super(ItemCode.MOVIE);
	this.type = type;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

}
