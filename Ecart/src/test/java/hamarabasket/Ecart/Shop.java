package hamarabasket.Ecart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
	
	private List<Product> products = new ArrayList<Product>();
	
	public void endOfDay() {
		for(Product product:products){
			product.updateQulaity();
			product.updateSellByValue();
		}
	}

	public void addProduct(Product standardProduct) {
		this.products.add(standardProduct);
	}

	public Product getProductByName(String name) {
		for(Product product:this.products){
			String pName = product.getName();
			if(pName.equals(name)){
				return product;
			}
		}
		return null;
	}
}
