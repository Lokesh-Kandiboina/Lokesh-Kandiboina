
public class DecisionIfElse {

	public static void main(String[] args) {
		int x = 2;
		
		if(x==5)
		{
			if(x>=5)
			{
				System.out.println("X is greater then 5");
			}
			else
			{
				System.out.println("X is smaller then 5");
			}
		}
		if(x==5)
		{
			System.out.println("X equals to 5");
		}
		else if (x > 5)
		{
			System.out.println("X is greater to 5");
		}
		else
		{
			System.out.println("X is smaller then 5");
		}
	}

}
