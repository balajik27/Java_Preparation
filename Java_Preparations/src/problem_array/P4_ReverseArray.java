package problem_array;

public class P4_ReverseArray {
	static int[] reverse(int arr[] , int length) {
		for(int i=0;i<length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[length - i -1];
			arr[length - i - 1] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,3,7};
		int a[] = reverse(arr,arr.length);
		for(int n :a) {
			System.out.println(n);
		}
	}

}
