package looping;
/*Take 10 integer value from keyboard by using for looping and 
find the largest value from those 10 numbers.*/

import java.util.Scanner;

public class Max_value {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		int temp_large=0;
		int num;
		for(num=1;num<=10;num++) {
			System.out.println(" Enter value of num"+num+":");
			int value = obj.nextInt();
			if(value>temp_large)
				temp_large=value;
		}
		System.out.println("Largest value is:"+temp_large);
		// TODO Auto-generated method stub

	}

}
