package com.hamarabasket;

import java.util.ArrayList;
import java.util.Date;

public class BasketDemo {

	public static void main(String[] args) {
		
		//Item creation
		Item normal = new Item(Type.NORMAL, new Date(), 10, new Date() );
		Item wine = new Item(Type.WINE, new Date(), 10, new Date());
		
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(normal);
		list.add(wine);
		
		Shop shop = new Shop();
		for (Item item : list) {
			shop.buyItem(item);
		}

	}
	
	
}


