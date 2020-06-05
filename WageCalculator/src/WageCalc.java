import java.util.Scanner;

public class WageCalc {
	
	public static char currency = '£';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter hourly wage: ");
		String mywage = keyboard.nextLine();
		System.out.print("Please enter hours worked: ");
		String myhours = keyboard.nextLine();
		
		String res = convertWageToSalary(mywage, myhours);
		System.out.print("When I called the convertWagetoSalary it came back with: " + res);
	}
	
	public static String convertWageToSalary(int wage, double hours)
	{
		double salary = wage * hours * 52;
		int salaryToGiveBack = (int) salary;
		
		double decimal = salary - salaryToGiveBack;
		if (decimal >= .5)
			salaryToGiveBack++;
		
		return "" + currency + salaryToGiveBack;
	}
	
	public static String convertWageToSalary(String wage, String hours)
	{
		double salary = Double.parseDouble(wage) * Double.parseDouble(hours) * 52;
		int salaryToGiveBack = (int) salary;
		
		double decimal = salary - salaryToGiveBack;
		if (decimal >= .5)
			salaryToGiveBack++;
		
		return "" + currency + salaryToGiveBack;
	}
	public static String convertWageToSalary(String wage, int hours)
	{
		return "You're awesome";
	}
}
