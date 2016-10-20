
public class SwapTwoValues {
	public static void main(String args[]) {
		int from = Integer.parseInt(args[0]), to = Integer.parseInt(args[1]);
		//from = 1
		//to = 2
		
		from += to;
		//from = 3
		//to = 2
		
		to = from - to;
		//from = 3
		//to = 1
		
		from = from - to;
		//from = 2
		//to = 1
				
		System.out.println("From: " + from + " | " + " To: " + to);
	}

}
