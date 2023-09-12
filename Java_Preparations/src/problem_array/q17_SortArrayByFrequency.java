package problem_array;
import java.util.Map.Entry;
import java.util.HashMap;

public class q17_SortArrayByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1,3,3,2,1,2,3,5,6,4,7,8,7,5,6,9,9,9,9,1,2};
//		int arr[] = {1,2,3,2,4,3,1,2};
//		int arr[] = {-199,6,7,-199,3,5};
		int arr[] = {3, 3, 5, 2, 1, 1, 2};
		
		
		HashMap <Integer , Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i]) == false) {
				hm.put(arr[i], 1);
				continue;
			}
			hm.put(arr[i], hm.get(arr[i]) +1);
		}
		for(Entry <Integer , Integer> entry : hm.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			for(int j=0;j<value;j++) {
				System.out.print(key + " ");
			}
		}
		
//		this is only for numbers between 0-9
//		int freq[] = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			freq[arr[i]]++;
//		}
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<freq[i];j++) {
//				System.out.print(i+" ");
//			}
//		}
	}

}
