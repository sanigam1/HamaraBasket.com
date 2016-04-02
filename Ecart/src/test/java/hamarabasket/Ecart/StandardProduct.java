package hamarabasket.Ecart;

public class StandardProduct extends Product {

	@Override
	public void updateQulaity() {
		if(quality > 0){
			--quality; 
		}

	}

	@Override
	public void updateSellByValue() {
		if(sellByValue > 0){
			--sellByValue;
		}

	}

}
