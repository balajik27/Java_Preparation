package problem_array;

public class q20_FindAllPalindrome {
	static void findAllPalindrome(int start , int end) {
		for(int i=start;i<end;i++) {
			int rev = 0;
			int temp = i;
			while(temp>0) {
				int dig = temp%10;
				rev = rev *10 +dig;
				temp/=10;
			}
			if(i == rev){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 150;
		findAllPalindrome(a,b);
	}

}
