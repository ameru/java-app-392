// Write a statement that prints "Hello, World" to the screen.
System.out.print("Hello, world");

//Write a complete main method that prints "Hello, World" to the screen.
public static void main( String[] args)
{
	System.out.println("Hello, world");
	System.exit (0);
}

// Write a complete program whose class name is Hello and that displays Hello, world on the screen.
public class Hello
{
	public static void main(String [] args)
	{
		System.out.println("Hello, world");
		System.exit(0);
	}
}

// Rearrange the following code so that it forms a correct program that prints out the letter Q:
public class Q{
	public static void main(String[] a){
		System.out.println("Q");
	}
}

/* Given an int variable datum that has already been declared, write a few statements that read an integer 
  value from standard input into this variable. */
Scanner x=new Scanner(System.in); 
datum = x.nextInt();

// Declare a variable x, suitable for storing values like 3.14159 and 6.02E23.
float x;

// Declare a variable populationChange, suitable for holding numbers like -593142 and 8930522.
int populationChange ;

/* Declare and initialize the following variables:
- monthOfYear, initialized to the value 11
- companyRevenue, initialized to the value 5666777
- firstClassTicketPrice, initialized to the value 6000
- totalPopulation, initialized to the value 1222333 */
int monthOfYear = 11;
int companyRevenue = 5666777;
int firstClassTicketPrice = 6000;
int totalPopulation = 1222333;

// Declare two double variables, one named length with a value of 3.5 and the other named width with a value of 1.55.
double length = 3.5;
double width = 1.55;

/* Given two int variables, i and j, which have been declared and initialized, and two other int variables, 
  itemp and jtemp, which have been declared, write some code that swaps the values in i and j by copying their values 
  to itemp and jtemp respectively, and then copying itemp and jtemp to j and i respectively. */
jtemp = j;
itemp = i;
j = itemp;
i = jtemp;

/* Given three already declared int variables, i, j, and temp, write some code that swaps the values in i and j. 
  Use temp to hold the value of i and then assign j's value to i. The original value of i, which was saved in temp, 
   can now be assigned to j. */
temp = i;
i = j;
j = temp;

/* Given two double variables, bestValue and secondBestValue, write some code that swaps their values. 
  Declare any additional variables as necessary. */
double x;
x = bestValue;
bestValue = secondBestValue;
secondBestValue = x;

/* Four integer variables, pos1, pos2, pos3, pos4 have been declared and initialized. Write the code 
  necessary to "left rotate" their values: for each variable to get the value of the successive variable, 
  with pos4 getting pos1's value. */
int var = 0;
var = pos1;
pos1 = pos2;
pos2 = pos3;
pos3 = pos4;
pos4 = var;

// Write a literal representing the long integer value twelve billion.
12000000000L

// Write a character literal representing the digit 1.
'1'

// Write a character literal representing the (upper case) letter A.
'A'

// Write a literal representing the character whose unicode value is 65.
65

// Declare an integer constant, MONTHS_IN_YEAR, whose value is 12.
final int MONTHS_IN_YEAR = 12;

/* Declare a constant MONTHS_IN_DECADE, whose value is the value of the constant 
  MONTHS_IN_YEAR (already declared) multiplied by 10. */
final int MONTHS_IN_DECADE = MONTHS_IN_YEAR * 10


