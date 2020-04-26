package looping;

public class Number_pattern {
	/*write the code to display the following code:
	     1
	    2 2
	   3 3 3
	  4 4 4 4
	  */

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {//for columns
			for(int j=4;j>=i;j--) {//handle space
				System.out.print(" ");
		     }
			for(int k=1;k<=i;k++) {//printing number in the rows
				System.out.print(i+" ");//also space here to make pyramid
			}
		        System.out.println();
				
		}
		// TODO Auto-generated method stub

	}

}
