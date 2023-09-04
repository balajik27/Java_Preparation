package problem_array;

import java.util.Arrays;

public class q10_MedianArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,1,4,6,5,7};
		Arrays.sort(arr);
		
		if(arr.length % 2== 0) {
			int first = (arr.length/2 ) -1;
			int second = (arr.length/2);
			System.out.println((double)(arr[first] + arr[second])/2);
		}
		else {
			System.out.println(arr[arr.length / 2]);
		}
	}

}
