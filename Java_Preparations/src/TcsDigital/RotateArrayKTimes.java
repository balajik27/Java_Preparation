package TcsDigital;

import java.util.Arrays;

public class RotateArrayKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{10, 20, 30, 40, 50};
		int[] ans = rotateArrayTcAndScOptimal(arr , 2);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] rotateArray(int[] arr , int k) {
		
		if(k == arr.length) return arr;
		int[] temp = new int[arr.length];
		int length = arr.length;
		int i , j = 0;
		for(i = length - k , j = 0;i<arr.length;i++, j++) {
			temp[j] = arr[i];
		}
		i = 0;
		while(j<arr.length) {
			temp[j] = arr[i];
			j++;
			i++;
		}
		System.out.println(Arrays.toString(temp));
		return arr;
	}
	
	static int[] rotateArrayOptimal(int[] arr , int k) {
		
		int length = arr.length;
		
		if(k == arr.length) return arr;
		if(k>length) {
			k = k % length;
		}
		
		int[] ans = new int[length];
		for(int i=0;i<k;i++) {
			ans[i] = arr[length - k + i];
		}
		int index = 0;
		for(int i=k;i<length;i++) {
			ans[i] = arr[index++];
		}
		
		return ans;
	}
	
	static int[] rotateArrayTcAndScOptimal(int[] arr , int k) {
		
		int length = arr.length;
		k = k % length; // reduce the rotation of array if k is greater than length
		reverseArray(arr , length - k , length-1); // 10 , 20 , 30 , 50 , 40 
		reverseArray(arr , 0 , length - k -1); // 30 , 20 , 10 , 50 , 40 
		reverseArray( arr , 0 , length - 1); // 40 , 50 , 10 , 20 , 30 
		return arr;
	}
	static void reverseArray(int[] arr , int start , int end) {
		for(; start<end; start++ , end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}
