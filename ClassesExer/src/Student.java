
public class Student {
	// data that describes a student
	
	public String name;
	public int age;
	public String id;
	public double gpa;
	private double accountBalance;
	
	public void setGPA(double[] x)
	{
		double sum = 0;
		for(int i = 0; i < x.length; i++)
		{
			sum = sum + x[i];
		}
		
		gpa = sum/x.length;
	}
	
	public void setName(String nm)
	{
	name = nm;
	}
	// actions that can be taken
	
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	public boolean equals(Student otherguy)
	{
		boolean isSame = this.name == otherguy.name && this.age == otherguy.age && this.id.equals(otherguy.id);
		
		return false;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
