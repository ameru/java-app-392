import java.util.Scanner;

public class Swapper {
	
	public static void main(String[] args)
	{
		int[] test1 = {1,2,3};
		int[] test2 = {4,5,6};
		swapper(test1, test2);
		System.out.print("Inside test1, first element is " + test1[0] + " and inside test2 is " + test2[0]);
	}
	
	public static void swapper(int[] test1, int[] test2)
	{
		test1 = test2; // test 1 is now referencing {4,5,6}
		int[] temp = {7,8,9};
		test2 = temp; // test 2 is now referencing {7,8,9}
	}
}
