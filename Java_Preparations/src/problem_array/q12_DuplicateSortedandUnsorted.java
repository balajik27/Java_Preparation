package problem_array;
import java.util.*;
public class q12_DuplicateSortedandUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 3, 9, 2, 4, 1, 7, 7, 7, 7, 7, 10, 89, 34};
		
        HashSet<Integer> hs = new HashSet<>();
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                arr[j++] = arr[i];
                hs.add(arr[i]);
            }
        }
        int a[] = new int[j];
        for(int i=0;i<j;i++){
            a[i] = arr[i];
        }
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
	}

}
