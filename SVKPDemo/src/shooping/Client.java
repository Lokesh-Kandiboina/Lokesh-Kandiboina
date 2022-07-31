package shooping;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSShopFactory gsshop=new GSShopFactory();
		gsshop.getNewPrimeAcc(0, null, 0, false);
		gsshop.getNewNormalAcc(2345, "Lokesh", 3000, 20);
		
		GSPrimeAcc gsprime=new GSPrimeAcc(123,"Naga Babu",2345,true);
		gsprime.BookProduct(3467);
		
		GSNormalAcc gsnormal=new GSNormalAcc(143,"Sai Ganesh",5689,500);
		gsnormal.BookProduct(450);
		
		gsprime.toString();
		gsnormal.toString();
	}
}
