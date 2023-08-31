package Day_1;
import java.util.Arrays;
//public class LargestNumber {
//	public static void main(String[] args) {
//		int arr[] = {4,5,2,6,8,1,3,4};
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-1]);
//		}
//}
//
public class LargestNumber {
	public static void main(String[] args) {
			int arr[] = {5,1,4,7,2,9};
			int max = arr[0];
			for(int i=1; i<arr.length;i++) {
				max = Math.max(max, arr[i]);
			}
			System.out.println(max);
		}
}
