package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=19;
		boolean state =false;
		
		// 0 and 1 are not prime numbers
		if (num==0 || num ==1) {
			state = true;
		}
		
		for (int i=2; i <=num/2; ++i) {  
			// condition for nonprime number
			if (num % i==0) {
				state =true ;
			}
		}
		
		if (!state) {
			System.out.println(num + " is a prime number");
		}
		
		else {
			System.out.println(num + " is a non prime number");
		}
	}
}
