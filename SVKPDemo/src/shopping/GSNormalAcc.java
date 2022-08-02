package shopping;

public class GSNormalAcc extends NormalAcc {
	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		//TODO Auto-generated constructor stub
	}
	public void BookProduct(float Charges) {
		System.out.println("dear normal user, your product charges are : "+" "+charges + " with deliverCharges: "+deliveryCharges);
		
	}
	@Override
	public String toString() {
		return "GSNormalAcc [accNo="  + accNo + ", accNm=" + accNm + ", charges" + charges + "]";
	}
}
