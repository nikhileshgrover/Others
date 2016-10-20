//Sep 18th 2016
public class CheckPalindrome {
	public static void main(String args[]) {
		String string = "nikint";
		String nString = "";
		
		for(int i=string.length()-1; i >= 0 ; i--) {
			nString += string.charAt(i);
		}
		
		//System.out.println(string);
		if(string.equalsIgnoreCase(nString))
				System.out.println("true");
		else
			System.out.println("false");
	}
}
