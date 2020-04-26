package looping;
/*write the code the to display the pattern:
     1
   2 1 2
 3 2 1 2 3
43 2 1 2 3 4
*/

public class Number_pattern2 {

	public static void main(String[] args) {
		int n=4;
		for(int i =1;i<=4;i++) {
			//for(int j = 1; j<=n-i;j++) instead of next for loop
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
				}
			for(int r=2;r<=i;r++) {
				
				System.out.print(r);
				
			}
			
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
