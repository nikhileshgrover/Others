
public class LargestSmallestNumberArray {
	public static void main(String args[]) {
		int arr[] = {1,6,3,2,100,34,87,434,22,87,23,87867,2,2,245,43};
		
		int smallest = arr[0], largest = arr[0];
		
		for(int i=0; i < arr.length; i++ ) {
			if(arr[i] < smallest) 
				smallest = arr[i];
			if(arr[i] > largest)
				largest = arr[i];
		}
		System.out.println(smallest);
		System.out.println(largest);
	}
}