package looping;
//write a program to break an integer into a sequence of individual digits.
//test data:12345
//Expected result : 1 2 3 4 5

import java.util.Scanner;

public class Break_number {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println(" put digit sequencely from '1 to 5' ");
		int digit =obj.nextInt();
		System.out.println(" After print individual digits is");
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		// TODO Auto-generated method stub
obj.close();
	}

}
