package app.item.children;

import app.common.ItemCode;
import app.item.parent.Item;

public class Xbox extends Item {
    public static final Integer XBOX_2004 = 2004;
    public static final Integer XBOX_2006 = 2006;

    Integer model;

    public Xbox(Integer model) {
	super(ItemCode.XBOX);
	this.model = model;
    }

    public Integer getModel() {
	return model;
    }

    public void setModel(Integer model) {
	this.model = model;
    }

}
