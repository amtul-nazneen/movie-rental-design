package app.item.children;

import app.common.ItemCode;
import app.item.parent.Item;

public class PS4 extends Item {
    public static final Integer V1 = 2;
    public static final Integer V2 = 1;

    Integer version;

    public PS4(Integer version) {
	super(ItemCode.PS4);
	this.version = version;
    }

    public Integer getVersion() {
	return version;
    }

    public void setVersion(Integer version) {
	this.version = version;
    }

}
