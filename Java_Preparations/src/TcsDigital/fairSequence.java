package TcsDigital;
import java.util.Scanner;

public class fairSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of elements in the array
        int[] array = new int[N];

        // Input array elements
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int maxSum = findMaxSum(array);
        System.out.println(maxSum);
	}
	 private static int findMaxSum(int[] array) {
	        int maxSum = 0;
	        int sum = 0;
	        boolean positive = true; // Flag to indicate whether the current subsequence should start with a positive or negative number

	        for (int num : array) {
	            if ((positive && num > 0) || (!positive && num < 0)) {
	                sum += num;
	                maxSum = Math.max(maxSum, sum);
	            } else {
	                sum = Math.max(0, num); // Reset sum if the current element breaks the fair sequence
	            }
	            positive = !positive; // Switch the flag for the next element
	        }

	        return maxSum;
	 }
}

