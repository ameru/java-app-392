import java.util.Scanner;

public class CarTransport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lrgCarrier = 9;
		int medCarrier = 4;
		int trailerCap = 1;
		System.out.print("Enter the number of cars to ship: ");
		Scanner numCars = new Scanner(System.in);
		int userInput = numCars.nextInt();
		int numLrg = userInput / lrgCarrier;
		int remainLrg = userInput % lrgCarrier;
		int numMed = remainLrg / medCarrier;
		int remainMed = remainLrg % medCarrier;
		int numTrailer = remainMed / trailerCap;
		System.out.println("Large carriers used: " + numLrg);
		System.out.println("Medium carriers used: " + numMed);
		System.out.println("Trailers used: " + numTrailer);
		numCars.close();
		
		
	}

}
