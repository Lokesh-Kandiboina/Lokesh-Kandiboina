
public class SwitchCaseString {

	public static void main(String[] args) {
	String name = "lo";
	
	switch(name.toLowerCase())
	{
	case"author":
		System.out.println("Naga Babu");
		break;
	case"team":
		System.out.println("Team Java Full Stack");
		break;
	case"editor":
		System.out.println("Sai Ganesh & Ramesh");
		break;
	default:
		System.out.println("Invalid Entry");
		break;
	}
	}

}
