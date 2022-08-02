package shopping;

public class PrimeAcc extends ShopAcc {

	private boolean isPrime;
	private static final float deliveryCharges = 0;
	
	public PrimeAcc(int accNo, String accNm, float Charges, boolean isPrime) {
	super(accNo, accNm, Charges);
	this.isPrime = isPrime;
	}
	public void BookProduct(float charges) {
		
	}
	
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", charges=" + charges + "]";
	}


}
