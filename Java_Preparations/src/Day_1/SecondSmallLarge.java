package Day_1;
import java.util.Arrays;
public class SecondSmallLarge {

	
	static int Large(int arr[]) {
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>large) {
				second_large = large;
				large = arr[i];
			}
			else if(arr[i]>second_large && arr[i]!=large) {
				second_large = arr[i];
			}
			
		}
		return second_large;
	}
	static int Small(int arr[]) {
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				second_small = small;
				small = arr[i];
			}
			else if(arr[i]<second_small && arr[i]!=small) {
				second_small = arr[i];
			}
		}
		return second_small;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,7,2,4,1,9};
		
		//optimal way
		System.out.println(Small(arr) + " " + Large(arr));
		
		//brute force approach
		Arrays.sort(arr);
		System.out.println(arr[1] + " " +arr[arr.length -2]);
		
		
	}
}

