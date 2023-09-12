package problem_array;

public class q16_SymmetricPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{1, 2},{3,1}, {2, 1}, {3, 4}, {4, 5}, {1,3} , {4,3}, {5, 4}};
		
		int len = arr.length;
		
		for(int i = 0; i<len ; i++) {
			for(int j=i +1 ; j<len ; j++) {
				if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
					System.out.println("("+arr[j][0] + "," + arr[j][1]+")");
				}
			}
		}
		
		
	}
}
