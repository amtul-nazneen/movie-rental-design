package app.transaction;

import app.item.parent.Item;

public class CartItem {
    public Item item;

    public CartItem(Item item) {
	super();
	this.item = item;
    }

    public Item getItem() {
	return item;
    }

    public void setItem(Item item) {
	this.item = item;
    }
}
