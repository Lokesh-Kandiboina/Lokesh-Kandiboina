package shopping;

public class ShopAcc {
	public int accNo;
	public String accNm="Lokesh";
	public float charges;
	
	//constructor
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	//methods
	public void BookProduct(float charges) {
		
	}
	public void item(float charges) {
		
	}
	
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm +", charges=" + charges + "]";
	}
}