package looping;
/*write a program to display following pattern:
     *
    **
   ***
   */

public class Pattern_1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {//outer loop handle columns// contallpattern line
			for(int j=3;j>=i;j--) {//inner loop handle space
				System.out.print(" ");
			}
			 for(int k=1;k<=i;k++) {// each rows printing star
				 System.out.print("*");
			 }
			 System.out.println(" ");
		}
		
			
			
			
		
			
		
		//System.out.println(" ");
		// TODO Auto-generated method stub

	}

}
