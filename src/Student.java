
public class Student extends Person{

	private int graduationYear;  //added two additional properties
	private double gpa;
	
	public Student(String firstName, String lastName, int graduationYear, double gpa){
		super(firstName, lastName);
		this.graduationYear = graduationYear;
		this.gpa = gpa;
	}
	
	public void print(){
		System.out.println("Student Details:");
		super.print();
		System.out.println("\t" + graduationYear);
		System.out.println("\t" + gpa);
		
	}
}
