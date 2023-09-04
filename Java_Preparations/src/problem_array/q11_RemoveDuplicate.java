package problem_array;
import java.util.*;
public class q11_RemoveDuplicate {
	static int removeDuplicate(int[] array) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int n:array) {
			hs.add(n);
		}
		int k = hs.size();
		int j = 0;
		for(int n:hs) {
			array[j++] = n;
		}
		return k;
	}
	//optimal
	static int Removeduplicate(int[] array) {
		int i =0;
		for(int j = 1;j<array.length;j++) {
			if(array[i]!=array[j]) {
				array[++i] = array[j];
			}
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,3,2,6,7,7,1};
		int k = removeDuplicate(arr);
		k = Removeduplicate(arr);
		for(int i=0;i<k;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
