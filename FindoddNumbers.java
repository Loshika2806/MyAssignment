package week1.day1;
public class FindoddNumbers {

	public static void main(String[] args) {
		
		int oddNumber=10;
		System.out.print("List of odd numbers from 1 to "+oddNumber+": ");
		for (int i=1; i<=oddNumber; i++) {
			
			if (i%2==1) {
				
					System.out.println(i);
				}
			}
		}
	}