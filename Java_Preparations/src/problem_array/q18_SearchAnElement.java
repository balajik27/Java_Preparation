package problem_array;

import java.util.Arrays;
public class q18_SearchAnElement {
	static void linearSearch(int arr[] , int len, int search) {
		int flag = 0;
		for(int i=0;i<len;i++) {
			if(arr[i]==search) {
				System.out.println(search + " present in " + i + " index");
				flag = 1;
				break;
			}
		}
		if(flag == 0) 
			System.out.println(search + " not present in the array");
	}
	static void binarySearch(int arr[] , int len, int search) {
		Arrays.sort(arr);
		int low = 0;
		int high = len -1 , flag = 0;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]<search) {
				low = mid+1;
			}
			else if(arr[mid]>search) {
				high = mid-1;
			}
			else {
				flag = 1;
				System.out.println(search + " present in the array");
				break;
			}
		}
		if(flag == 0)
			System.out.println(search + " not present in the array");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,6,78,3,9};
		int search = 3;
		linearSearch(arr , arr.length, search);
		binarySearch(arr , arr.length, search);
	}
}
