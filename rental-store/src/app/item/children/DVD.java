package app.item.children;

import app.common.ItemCode;
import app.item.parent.Item;

/**
 * @author amtul.nazneen
 */
public class DVD extends Item {
    public static final Integer DVD_256 = 256;
    public static final Integer DVD_512 = 512;
    public static final Integer DVD_1024 = 1024;

    private Integer capacity;

    public DVD(Integer capacity) {
	super(ItemCode.DVD);
	this.capacity = capacity;
    }

    public Integer getCapacity() {
	return capacity;
    }

    public void setCapacity(Integer capacity) {
	this.capacity = capacity;
    }

}
