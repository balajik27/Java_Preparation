package problem_array;

import java.util.stream.IntStream;

//public class p7_SumOfNumber {
//	static int SumArray(int arr[]) {
//		int sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			sum +=arr[i];
//		}
//		return sum;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[] = {4,6,1,2,3,4,5,6,2};
//		System.out.println(SumArray(arr));
//	}
//
//}

public class p7_SumOfNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,6,2,3,4,5,6,2};
		System.out.println(IntStream.of(arr).sum());  // output = 32

		IntStream num = IntStream.of(arr);
		int s = num.sum();
		System.out.println(s); // can access s anytime , but num only once.
//		long c = num.count(); cant access again because it is used in previous line
	}
}
