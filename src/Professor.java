
public class Professor extends Person {// Professor object class extends Person

	public Professor(String firstName, String lastName){//constructor
		super(firstName, lastName); //super means the parent class
		
	}
	
	public void print(){ // overriding behavior in Person
		System.out.println("Professor Details:");
		super.print();
	}
}
