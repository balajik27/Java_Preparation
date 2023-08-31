package Day_1;
import java.util.Arrays;
public class SmallestNumber {
	public static void main(String[] args) {
		int arr[] = {2,5,3,1,6,7};
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
//
//public class SmallestNumber {
//	public static void main(String[] args) {
//		int arr[] = {2,1,5,7,2,4};
//		int min = arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(min>arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min);
//	}
//}
