package problem_array;
//day8
public class q19_Palindrome {
	static int reverse(int num) {
		int rev = 0;
		while(num>0) {
			int dig = num%10;
			rev= rev * 10 + dig;
			num /=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1221;
		int res = reverse(a);
		if(res == a) {
			System.out.println("this is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
