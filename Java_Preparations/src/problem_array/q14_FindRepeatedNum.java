package problem_array;
import java.util.*;

public class q14_FindRepeatedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> hs = new HashSet<>();
		int arr[] = {3,4,5,4,9,0};
		for(int i=0;i<arr.length;i++) {
			if(!hs.contains(arr[i])) {
				hs.add(arr[i]);
			}
			else {
				System.out.println(arr[i]);
			}
		}
	}

}
