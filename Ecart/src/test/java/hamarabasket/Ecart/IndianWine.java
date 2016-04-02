package hamarabasket.Ecart;

public class IndianWine extends Product {

	@Override
	public void updateQulaity() {
		if(quality < 50){
			++quality;
		}

	}

	@Override
	public void updateSellByValue() {
		

	}

}
