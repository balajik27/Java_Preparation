package TcsDigital;

public class FriendlyPairOrAmicablePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FriendlyPairOrAmicablePair pr = new FriendlyPairOrAmicablePair();
		amicable(1 , 28); // 1 + 2 + 3
		

	}

	static void amicable(int p1 , int p2) { // 1 ,2 ,3  100 = 1 * 100 , 2 * 50 , 4 * 25 , 10 * 10 
		int sum1= 0;
		int sum = 1;
		int n = 6;
		 for (int i = 2; i <= Math.sqrt(n); i++) { // 1 .. 10
	            if (n % i == 0) {
	                sum += i;  // 2 * 3 , 3 * 2 , 6 * 1
	                if (n / i != i) { // If the factors are not the same, add the other factor
	                    sum += n / i;
	                }
	            }
	        }
		 
		 System.out.println("sum = " + sum);
		for(int i=1;i<=Math.sqrt(p1);i++) {// 1, 2  ..10 
			if(p1 % i == 0) {
				if(i == 1) {
					sum1 = sum1 + i;
				} else if(i == p1/i) { // 10 * 10
	                sum1 = sum1 + i; 
				} else {
					sum1 = sum1 + i + p1/i;  // 1 * 6 , 2 * 3 , 3 * 2 , 6 * 1
				}
			}
		}
		int sum2 = 0;
		for(int i=1;i<p2;i++) { // 1 .... 100 
			if(p2 % i == 0) {
				sum2 = sum2 + i;
			}
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		if(sum1 == p1 && sum2 == p2) System.out.println("Friendly pair");
		else System.out.println("Not friendly pair");
	}
}
		