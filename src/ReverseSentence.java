
public class ReverseSentence {
	public static void main(String args[]) {
		String str = "This is test for a new code that I am writing";
		
		String strArr[] = str.split(" ");
		str = "";
		for (int i = strArr.length-1;i>-1;i--) {
			str = str + strArr[i] + " ";
		}
		
		str = str.trim();
		System.out.println(str);
	}
	
}
