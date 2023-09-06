package problem_array;
import java.util.*;
import java.util.Map.Entry;
//day6
public class q15_FindNonRepeated {
	static int[] UsingHashSet(int arr[]) {
		HashSet <Integer> hs = new HashSet<>();
		int count = 0;
		for(int n:arr) {
			if(!hs.contains(n)) {
				hs.add(n);
				count++;
			}
			else {
				hs.remove(n);
				count--;
			}
		}
		int i = 0;
		int a[] = new int[count];
		for(int n:hs) {
			a[i++] = n;
		}
		return a;
	}
	static int[] UsingHashMap(int arr[]) {
		HashMap <Integer , Integer> hm = new HashMap<>();
		int count=0;
		for(int n : arr) {
			if(hm.get(n) == null) {
				hm.put(n, 1);
				count++;
			}
			else {
				hm.put(n, hm.get(n) +1);
				count--;
			}
		}
		int a[] = new int[count];
		int i = 0;
		for(Entry<Integer,Integer> entry:hm.entrySet()) {
			
			if(entry.getValue() == 1) {
				a[i++] = entry.getKey();
//				System.out.println(entry.getKey() + " ");
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,4,5,5,6,6,7,8,9,22};
		
		int resultset[] = UsingHashSet(arr);
		int resultmap[] = UsingHashMap(arr);
//		UsingHashMap(arr);
		
		System.out.println("Using hashset : ");
		for(int n:resultset) {
			System.out.println(n);
		}
		System.out.println("Using hashmap : ");
		for(int n: resultmap) {
			System.out.println(n);
		}
	}

}
