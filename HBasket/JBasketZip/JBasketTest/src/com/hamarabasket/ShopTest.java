package com.hamarabasket;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
public class ShopTest {

	
	@Test
	public void checkQualityisNormal() {
		
		Item [] items=new Item[]{
			new Item(Type.NORMAL, new Date(), -4, new Date())
		};
		int [] expected = new int [] {0};
		
		int [] actuals = new int [1] ;
		actuals [0] = items [0].getQuality();
		Assert.assertArrayEquals(expected, actuals);
			
				
	}
	
	
	@Test
	public void checkCurrentquality() {
		Date d = new Date();
		int n=2;
		//Item item1=new Item(Type.NORMAL, new Date(), 10, new Date(d.getTime() - n * 24 * 3600 * 1000  ));
	
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, Calendar.MARCH, 25, 0, 0, 0);
		Date date1 = calendar.getTime();
		
		
		calendar.set(2016, Calendar.MARCH, 28, 0, 0, 0);
		Date date2 = calendar.getTime();

		
		Item [] items=new Item[]{
			new Item(Type.NORMAL, date2, 10, date1)
		};
		int [] expected = new int [] {8};
		
		int [] actuals = new int [1] ;
		actuals [0] = items [0].getQuality();
		Assert.assertArrayEquals(expected, actuals);
						
	}
	
	@Test
	public void checkQualityGrtThn50Allowed() {
		Date d = new Date();
		int n=2;
		Item item1=new Item(Type.NORMAL, new Date(), 55, new Date());
	
		Item [] items=new Item[]{
			item1
		};
		int [] expected = new int [] {50};
		
		int [] actuals = new int [1] ;
		actuals [0] = items [0].getQuality();
		Assert.assertArrayEquals(expected, actuals);
						
	}
	
	@Test
	public void checkQualityDegradesTwice() {
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, Calendar.MARCH, 25, 0, 0, 0);
		Date date1 = calendar.getTime();
		
		
		calendar.set(2016, Calendar.MARCH, 28, 0, 0, 0);
		Date date2 = calendar.getTime();


		
		Item item1=new Item(Type.NORMAL, date2, 18, date1);
	
		Item [] items=new Item[]{
			item1
		};
		int [] expected = new int [] {5};
		
		int [] actuals = new int [1] ;
		actuals [0] = items [0].getQuality();
		Assert.assertArrayEquals(expected, actuals);
						
	}
	
}

