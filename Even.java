package looping;
//write a program to print even or odd number by  using (for loop).

public class Even {
	public void check_number() {//user defined method
		int i;
		System.out.println(" Finding the even or odd number from '1 to 30'");
		for(i=1;i<=30;i++) {
		System.out.println(" The number "+i+" is,");
		if(i%2 ==0) {
			System.out.println(" even");
		}
		else {
			System.out.println(" odd");
		}}
	}
public void even_number() {//user defined method
	int i;
	System.out.println(" Finding the all even number from '1 to 40':- ");
	for(i=1;i<=40;i++) {
		if(i%2 ==0) {
			System.out.print(" "+i);
		}
	}
}
public void odd_number() {//user defined method
	int i;
	System.out.println(" ");
	System.out.println(" Finding the all odd number from '1 to 50' :-");
	for(i=1;i<=50;i++) {
		if(i%2 ==1) {
			System.out.print(" "+i);//uses print() for printing result single line
		}
	}
}
	public static void main(String[] args){
		Even obj = new Even();
		//below method calling
		obj.check_number();
		obj.even_number();
		obj.odd_number();
		// TODO Auto-generated method stub

	}

}
