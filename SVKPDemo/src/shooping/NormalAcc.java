package shooping;

public class NormalAcc extends ShopAcc {
	
	public final float deliveryCharges;
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
		//TODO Auto-generated constructor stub
	}
	
	public void BookProduct(float charges) {
		
	}
	
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges = " + deliveryCharges + "]";
	}
}