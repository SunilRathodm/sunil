package a24CollectionInJava;

import java.util.HashMap;            //imported Hashmap

public class Hashmap6 {

	public static void main(String[] args) {

//Hashmap is used for indexing purpose 

	HashMap<String,Integer> hash=new HashMap();     //Key And Value pair
	
	hash.put("Sunil", 12454);                      //when key is same,It will take updated value.
	hash.put("Sunil",12455 ); 
	hash.put("Ram", 12455);
	hash.put("Ajay", 12455);
	
	
	System.out.println(hash);
	
	boolean z=hash.containsKey("Ram");    //containkey is method used for value is avaiable or not.if avaiable it will TRUE otherwise FALSE
		
	System.out.println("value of z ="+ z );
	
	Integer a=hash.get("Sunil");          //get method is used for,It will return value for given Key.
		
		System.out.println("Key of Sunil="+a);
		
		hash.remove("Sunil");
		
		System.out.println("hash after remove="+hash);
	}

}
