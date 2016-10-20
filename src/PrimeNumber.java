//17-Sep-2016
public class PrimeNumber {
	public static void main(String args[]){
		boolean isPrime = true;
		int num = Integer.parseInt(args[0]);
		
		for(int i=2; i < num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(num + " isPrime: " + isPrime);
	}
}


/*
1/1
2/2
3/2
3/3
4%2 = 0
4/4 = 0
7/1 = 0
7/2 = 1
7/3 = 1

*/





/*
public class PrimeNumber {
	public static void main(String args[]) {
		int num =  Integer.parseInt(args[0]);
		boolean isPrime = false;
		for(int i = 2;i <=num;i++) {
			if (num%i == 0)
				isPrime = false;
			else
				isPrime = true;
		}
		
		if (num <= 2) isPrime = false;
		System.out.println(isPrime);
		System.out.println(num);
	}
}
*/