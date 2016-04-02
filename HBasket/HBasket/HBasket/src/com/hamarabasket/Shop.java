package com.hamarabasket;

import java.util.Date;

public class Shop {
	public void display() {

	}

	public Item buyItem(Item item) {

		Item itemNow = findTheCurrentStatus(item);
		return itemNow;
	}
	
	Item findTheCurrentStatus(Item item){
		
		Date currentDate = new Date();
		
		return item;
	}
}
