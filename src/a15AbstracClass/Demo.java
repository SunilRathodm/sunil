package a15AbstracClass;
//partial abstraction 
//hiding the implementation logic is called Abstraction
//abstract class can contain abstract and non abstract method 
// we can not create object of abstract class 
// we can create constructor of Abstract class 



public abstract class Demo {          //Abstract 
	
	
	public Demo() {
		
		System.out.println("Demo consructor output");
	}
	public abstract void Display();
	
	
	public void input() {
		System.out.println("abstact demo class metod  ");
	}
	 
		
		


}
