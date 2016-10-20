//This requires some more work. This is not complete yet
//Sep 18th 2016


public class FibonacciRecursive {
	private int base = 0;
	private int nth = 0, i = 0;
	private int fibonacci = 1;
	public static void main(String args[]) {
		FibonacciRecursive fr = new FibonacciRecursive();
		fr.nth = Integer.parseInt(args[0]);

		fr.computeFibonacci(fr.base, fr.fibonacci);
	}
	
	private int computeFibonacci(int base, int fibonacci) {
		
		int temp = fibonacci;  
		fibonacci += base;
		base = temp;
		if(this.i < this.nth) {
			this.i++;
			System.out.println(fibonacci);
			return computeFibonacci(base, fibonacci);
		}
		System.out.println(fibonacci);
		return fibonacci;
	}
}
