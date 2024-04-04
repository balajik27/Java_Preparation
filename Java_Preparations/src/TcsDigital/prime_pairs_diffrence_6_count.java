package TcsDigital;
import java.util.*;
public class prime_pairs_diffrence_6_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int nums[] = new int[]{21, 12, -6, 13 , -21 , -2 };  

	                      
	   int start = 4;
	   int end = 30;
	   int count = 0;
//	   int iterate = 0;
	   ArrayList<Integer> list = new ArrayList<>();
	   for(int i =start; i<=end; i++){
	       if(i%2!=0){
	           boolean isPrime = true;
	            for(int j = 2;j<=Math.sqrt(i);j++){
//	                ++iterate;
	                if(i%j==0){
	                    isPrime = false;
	                    break;
	                }
	            }
	            if(isPrime){
	                list.add(i);
	                int value = i - 6;
	                if(list.contains(value)){
	                    count++;
	                }
	            }
	       }
	   }
//	   System.out.println(iterate);
	   System.out.println(list);
	   System.out.println(count);
	   
	}

}
