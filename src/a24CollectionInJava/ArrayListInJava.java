package a24CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListInJava {

	public static void main(String[] args) {
	
		//create abject of classes
		
		ArrayList<Integer> list=new ArrayList();   //created object of. array store similar data type 
		
		list.add(new Integer(10));       //adding object of integer,value added in array list.
		list.add(new Integer(20));       //Arraylist allow Duplicate value 
		list.add(new Integer(10));       // arraylist and Linkedlist allow Null value
		list.add(new Integer(40));
		
		list.add(2,new Integer(30));    //adding 30 value in index at 2
		list.add(23);                   //for adding value in array
		list.add(45);
	
		
		list.add(null);
		
		System.out.println(list);
		
		list.remove(0);             //for removing value from arraylist using index 
		
		System.out.println(list);
		
		ArrayList<Object> list1=new ArrayList();   //Object is super class of all classes in java,allow any type of object	
		list1.add(new Integer(34));
		list1.add(new String("Hello"));
		list1.add(new Float(23.89));
		System.out.println(list1); 
		
		
		
		
		
	}

}