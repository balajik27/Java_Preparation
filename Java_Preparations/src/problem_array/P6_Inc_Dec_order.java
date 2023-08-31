package problem_array;
import java.util.Arrays;
public class P6_Inc_Dec_order {
	
	// just print doesn't return
	static void incDec(int arr[],int len) {
		Arrays.sort(arr);
		for(int i=0;i<len/2;i++) {
			System.out.println(arr[i]);
		}
		for(int i=len-1;i>=len/2;i--) {
			System.out.println(arr[i]);
		}
	}
	
	//return the array
	static int[] incDecReturn(int arr[] , int len) {
		Arrays.sort(arr);
		int[] result = new int[len];
		int left = 0;
		int right = len -1;
		
		for(int i=0;i<len/2;i++) {
			result[i] = arr[left++];
		}
		for(int i=len/2;i<len;i++) {
			result[i] = arr[right--];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,2,7,3,8,1,6};
		incDec(arr,arr.length);
		int res[] = incDecReturn(arr,arr.length);
		for(int n : res) {
			System.out.println(n);
		}
	}
}



