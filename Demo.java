package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " walk");
	}
    
}

public class Demo {

	public static void main(String[] args) {
		
		// Initiate object myPerson
		Person myPerson = new Person();
		
		// define new properties
		myPerson.name = "dox";
		myPerson.email = "dox@gmail.com";
		
		
		// Abstraction
		System.out.println(myPerson.name);
		myPerson.walk();
		
		work();
		

	}

}
