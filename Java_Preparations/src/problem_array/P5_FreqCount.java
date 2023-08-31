package problem_array;

public class P5_FreqCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,5,4,3,6,7,6,7,5};
		int freq[] = new int[10];
		for(int n:arr) {
			freq[n]++;
		}
		for(int i =0;i<10;i++) {
			if(freq[i]!=0)
				System.out.println(i + " " +freq[i]);
		}
	}

}

//import java.util.*;
//public class FreqCount{
//	static void count(int arr[] , int length) {
//		Map<Integer , Integer> newarr = new HashMap();
//		for(int i=0;i<length;i++) {
//			if(newarr.containsKey(arr[i])) {
//				newarr.put(arr[i] , newarr.get(arr[i]) +1);
//			}
//			else {
//				newarr.put(arr[i], 1);
//			}
//		}
//		for(Map.Entry<Integer , Integer> n : newarr.entrySet()) {
//			System.out.println(n.getKey() + " " + n.getValue());
//		}
//	}
//	public static void main(String args[]) {
//		int arr[] = {4,3,5,6,7,5,4,3,6,9,5,0};
//		count(arr,arr.length);
//	}
//}

