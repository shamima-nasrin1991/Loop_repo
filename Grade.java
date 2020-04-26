package looping;
/*Take five subject number of a student. Take the marks those subject from keyboard.And calculate 
 it's goes to which grade.*/
 

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println(" plz enter the valid number '0 to 100' ");
		int marks ;double total=0, avg;
		for(int i=1;i<=5;i++) {
			System.out.println("Enter marks of subject "+ i+" :"  );
			marks=obj.nextInt();
			total+=marks;
		}
		avg=total/5;
		
		System.out.println(" The student grade is :");
		if(avg>=80 && avg<100) {
			System.out.println("A");
		} 
		else if(avg>=70 && avg<80) {
			System.out.println("A-");
		}
		else if(avg>=60 && avg<70) {
			System.out.println("B");
		}
		else if(avg>=50 && avg<60) {
			System.out.println("B-");
		}
		else if(avg>=40 && avg<50) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		// TODO Auto-generated method stub

	}

}
