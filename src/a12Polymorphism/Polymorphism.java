package a12Polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		
		//NAME WILL BE SAME BUT IT PERFORMING DIFFERENT TASK
	    // Compile Time polymorphism ====Method overloading
		//Run time polymorphism =========Method of overriding

		Polymorphism A = new Polymorphism();
		A.show();
		A.show(556);
		
	int z=A.show(56, 85);      //when return type need to save output
	
		System.out.println(z);
	}

	public void show() {
		System.out.println("show method");
	}
	public void show(int a) {
		System.out.println("show method a :"+a);	
	}
	public int show(int a,int b) {

		System.out.println("a and b show method =" +a+" :"+b);
		return a+b;
	}
}
