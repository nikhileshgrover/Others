class Fibonacci{
	public static void main(String args[]) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21,
		int nth = Integer.parseInt(args[0]), fibonacci = 1, base = 1;
		
		if(nth < 1) {
			System.out.println(nth);
		}
		else {
			for(int i = 2; i < nth; i++) {
				int temp = fibonacci;
				fibonacci += base;
				base = temp;
			}
			System.out.println(fibonacci);
		}
				
		//System.out.println(fibonacci);
	}
}
	
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	public static void main(String[] args) {
	System.out.println("Hello World");

	int abc = Integer.parseInt(args[0]);
	ComputeFibonacci cf = new ComputeFibonacci();
	cf.fib(abc);
}*/

