package hamarabasket.Ecart;

public abstract class Product {
	
	protected int sellByValue;
	protected  int quality;
	protected String name  ;
	
	public abstract void updateQulaity();
	public abstract void updateSellByValue();

	public void setSellByValue(int i) {
		this.sellByValue = i;
	}

	public int getSellByValue() {
		return this.sellByValue;
	}

	public void setQuality(int quality) {
		this.quality = quality;
		
	}

	public int getQuality() {
		
		return this.quality;
	}

	public void setName(String name ) {
		
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	

}
