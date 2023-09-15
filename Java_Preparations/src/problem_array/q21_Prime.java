package problem_array;
//day8
public class q21_Prime {
	static int checkPrime(int num) {
		double sqrt = Math.sqrt(num); // using square root reduce the iterations
		for(int i=2;i<sqrt;i++) {
			if(num%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 62;
		if(checkPrime(a) == 1)
		System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
	}

}
