/**
 * 
 */
package app.item.children;

import app.common.ItemCode;
import app.item.parent.Item;

/**
 * @author amtul.nazneen
 */
public class VideoGame extends Item {
    public static final String RACE = "RACE";
    public static final String KIDS = "KIDS";

    String type;

    public VideoGame(String type) {
	super(ItemCode.VIDEO_GAME);
	this.type = type;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

}
