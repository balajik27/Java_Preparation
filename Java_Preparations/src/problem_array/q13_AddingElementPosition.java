package problem_array;

public class q13_AddingElementPosition {
	static int[] AddinFront(int arr[] , int value) {
		int a[] = new int[arr.length+1];
		a[0] = value;
		for(int i=1;i<a.length;i++) {
			a[i] = arr[i-1];
		}
		return a;
	}
	static int[] AddinLast(int arr[] , int value) {
		int a[] = new int[arr.length+1];
		a[a.length-1] = value;
		for(int i=0;i<a.length-1;i++) {
			a[i] = arr[i];
		}
		return a;
	}
	static int[] AddinPos(int arr[] , int pos , int value) {
		int a[] = new int[arr.length+1];
		for(int  i = 0;i<pos;i++) {
			a[i] = arr[i];
		}
		a[pos] = value;
		for(int i=pos+1;i<a.length;i++) {
			a[i] = arr[i-1];
		}

		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,5};
		int ar[] = AddinFront(arr , 5);
		for(int n:ar) {
			System.out.println(n);
		}
		int ls[] = AddinLast(arr,7);
		System.out.println();
		for(int n:ls) {
			System.out.println(n);
		}
		System.out.println();
		int pos[] = AddinPos(arr , 3, 56);
		for(int n : pos) {
			System.out.println(n);
		}
 	}

}
