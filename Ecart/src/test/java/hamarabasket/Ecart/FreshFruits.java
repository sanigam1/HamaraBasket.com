package hamarabasket.Ecart;

public class FreshFruits extends Product {

	@Override
	public void updateQulaity() {
		// TODO Auto-generated method stub
		if(quality > 0){
			quality=quality-2; 
		}
	}

	@Override
	public void updateSellByValue() {
		// TODO Auto-generated method stub

	}

}
