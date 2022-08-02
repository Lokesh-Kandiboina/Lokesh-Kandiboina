package shopping;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges=0;
	
	//constructor
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto generated constructor stub
	}

	@Override
	public void BookProduct(float charges) {
		System.out.println("Dear prime user,your product charges are "+charges);
	}
	
	@Override
	public String toString() {
		return "GSPrime [accNo" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
}
