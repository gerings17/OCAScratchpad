package org.jtl.oca;

public class ObjectInitializationExcercise {
	public String fruit = "Banana";
	static String veg = "lettuce";
	
	public ObjectInitializationExcercise(){
		System.out.println("In Constructer.");
	}
	public static void main (String[] args){
		System.out.println("In main method.");
		System.out.println(veg);
		ObjectInitializationExcercise object = new ObjectInitializationExcercise();
		System.out.println(object.fruit);
	}
	
	{
		System.out.println("In the initializer block." );
	}
	static{
		System.out.println("In the static initializer block." +veg);
	}
	
}
