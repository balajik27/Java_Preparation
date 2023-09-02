package problem_array;

import java.util.stream.IntStream;

public class p9_AvgNum {
	static double avg(int arr[]) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		double result = (double) sum/arr.length;
		return result;
	}
	static double avg_intstream(int arr[]) {
		return (double)IntStream.of(arr).sum() / arr.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {3,5,2,6,1,7};
			System.out.println(avg(arr));
			System.out.println(avg_intstream(arr));
	}

}
