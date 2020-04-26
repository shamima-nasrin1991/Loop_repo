package looping;
//print the following pattern by using (for loop).

public class Print {

	public static void main(String[] args) {
		//Here i is for row. and j is for column
		for(int i=0;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			    System.out.println(" ");
			}

		/*for(int i=5;i>=1;i--) {//i=rows
			for(int j=1;j<=i;j++) {//j=columns
			System.out.print(j+" ");
		}
		    System.out.println();
		}*/
		// TODO Auto-generated method stub

	}

}
