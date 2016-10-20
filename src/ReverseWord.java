//Sep 18th 2016
public class ReverseWord {
	public static void main(String args[]) {
		String string = args[0];
		//System.out.println(string.charAt(0));
		
		
		for(int i=string.length()-1; i >= 0 ; i--) {
			System.out.println(string.charAt(i));
		}
	}
}
