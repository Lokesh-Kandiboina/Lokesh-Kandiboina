
public class array {

	public static void main(String[] args) {
		//for loop
		for(int i=1,j=1;i<10||j<10||j<10;i++,j++)
		{
			j++;
			System.out.println("i="+i+" and j="+j);
		}
		//while loop
		int k=1,l=1;
		while(k<10||l<10)
		{
			k++;l++;
			System.out.println("k="+k+" and l=" +l);
		}
		//do while loop
		int m=1,n=1;
		do{
			m++;
			n++;
			System.out.println("m="+m+" and n="+n);
		}while(m<10||n<10);
	}

}
