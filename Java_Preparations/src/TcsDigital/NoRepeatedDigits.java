package TcsDigital;

import java.util.*;

public class NoRepeatedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] nums = new int[]{2,3,4,3,2,4};
		
		int count = 0;
		for(int i=101;i<=200;i++) {
			int temp = i;
			boolean available = false;
			ArrayList<Integer> list = new ArrayList<>();
			while(temp>0) {
				if(list.contains(temp%10)) {
					available = true;
					break;
				} else {
					list.add(temp%10);
				}
				temp/=10;
			}
			if(!available) {
				count++;
			}
		}
		System.out.println(count);
	}

}
