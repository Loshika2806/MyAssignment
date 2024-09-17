package week1.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int numbers[]={1,4,3,2,8,6,7};
        Arrays.sort(numbers);
        int i=1;

        while ( i < numbers.length ) 
        {
            if ( numbers[i] - numbers[i-1] == 1 ) 
            {
            } 
            else 
            {
                System.out.println( "Missing number is " + ( numbers[i-1] + 1 ) );
            }
            i++;
        }

	}

}
