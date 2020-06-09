
public class RunnableStuff {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.print(student1.equals(student2));
		
		double [] grades = {1,2,3,4};
		Student[] mystudents = new Student[10];
		
		double mybalance = student1.getAccountBalance();

		for(int i = 0; i < mystudents.length; i++)
		{
			mystudents[i] = new Student();
		}
		
		student1.setGPA(grades);
		student1.setName("Amy");
		student2.setName("Jayden");
		
		System.out.println(student1.name + " has a gpa of " + student1.gpa);
		System.out.println(student2.name + " has a gpa of " + student2.gpa);
	}
} 
