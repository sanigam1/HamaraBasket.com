package hamarabasket.Ecart;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class testHamaraBasket {

	@Test
	public void shouldBeAbleToSetSellByValue() {
		Product product = new StandardProduct();
		product.setSellByValue((int)9);		
		assertEquals((int)9, product.getSellByValue());
		
	}
	
	@Test
	public void shouldBeAbleToSetQualityByValue() {
		Product product = new StandardProduct();
		product.setQuality((int)9);		
		assertEquals((int)9, product.getQuality());		
	}
	
	@Test
	public void shouldDecreaseQaulityByOneForStandardProducts() {
	
		Shop shop = addProductToCart(10,10,"Shampoo");
		Product product = shop.getProductByName("Shampoo");
		assertEquals(9, product.getQuality());
	}
	
	@Test
	public void shouldDecreaseSellInByOneForStandardProducts() {
		Shop shop = addProductToCart(10,5,"Soap");
		Product product = shop.getProductByName("Soap");
		assertEquals(9, product.getSellByValue());
	}
	
	@Test
	public void shouldEnsureQualityShouldNotDecreaseBelowZero(){
		Shop shop = addProductToCart(0,0,"Shampoo");
		Product product = shop.getProductByName("Shampoo");
		assertEquals(0, product.getQuality());
	}

	
	
	@Test
	public void shouldEnsureSellByDecreaseBelowZero() {
		Shop shop = addProductToCart(0,0,"Soap");
		Product product = shop.getProductByName("Soap");
		assertEquals(0, product.getSellByValue());
	}
	
	@Test
	public void shouldEnsureQualityBelow51() {
		Shop shop = addProductIndianWineToCart(0,50,"Indian Wine");
		Product product = shop.getProductByName("Indian Wine");
		assertEquals(50, product.getQuality());
	}
	
	@Test
	public void shouldEnsureQualityIncresesByOneByEOD() {
		Shop shop = addProductIndianWineToCart(10,10,"Indian Wine");
		Product product = shop.getProductByName("Indian Wine");
		assertEquals(11, product.getQuality());
	}
	
	@Test
	public void shouldNotDecreaseQualityForForestHoney() {
		Shop shop = new Shop();
		Product standardProduct = new ForestHoney();
		standardProduct.setName("Forest Honey");
		standardProduct.setQuality(10);
		standardProduct.setSellByValue(10);
		shop.addProduct(standardProduct);
		
		Product product = shop.getProductByName("Forest Honey");
		assertEquals(10, product.getQuality());
	}
	
	@Test
	public void shouldDecreaseQualitybytwoForFreshFruits() {
		Shop shop = new Shop();
		Product standardProduct = new FreshFruits();
		standardProduct.setName("Fresh fruits");
		standardProduct.setQuality(10);
		standardProduct.setSellByValue(10);
		shop.addProduct(standardProduct);
		shop.endOfDay();
		Product product = shop.getProductByName("Fresh fruits");
		assertEquals(8, product.getQuality());
	}
	
	private Shop addProductToCart(int SellBy, int Quality,String Name ) {
		Shop shop = new Shop();
		Product standardProduct = new StandardProduct();
		standardProduct.setName(Name);
		standardProduct.setQuality(Quality);
		standardProduct.setSellByValue(SellBy);
		shop.addProduct(standardProduct);
		shop.endOfDay();
		return shop;
	}
	
	private Shop addProductIndianWineToCart(int SellBy, int Quality,String Name ) {
		Shop shop = new Shop();
		Product standardProduct = new IndianWine();
		standardProduct.setName(Name);
		standardProduct.setQuality(Quality);
		standardProduct.setSellByValue(SellBy);
		shop.addProduct(standardProduct);
		shop.endOfDay();
		return shop;
	}
	
	
}
