package problem_array;

public class p8_RotateKtimes {
	static int[] rotate(int arr[] , int len,int k) {
		int result[] = new int[len];
		int a=0;
		int i;
		if(k>arr.length) {
			k = k%arr.length;
		}
		for(i=k;i<len;i++) {
			result[a++] = arr[i];
		}
		for(int j=0;j<k;j++) {
			result[a++] = arr[j];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int k = 7;
		int res[] = rotate(arr,arr.length,k);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
