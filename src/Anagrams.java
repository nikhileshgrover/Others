import java.util.Arrays;

/*
 * Input Parameters
 * ================
 * perfect
 * tefcrep
 * ================
 */

public class Anagrams {
	public static void main(String args[]) {
	
		
		char[] charArray0 = args[0].toCharArray();
		char[] charArray1 = args[1].toCharArray();
		
		Arrays.sort(charArray0);
		Arrays.sort(charArray1);
		
		System.out.print(Arrays.equals(charArray0, charArray1));
		
			
	}
}
