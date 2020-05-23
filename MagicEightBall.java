import java.util.Random;

public class MagicEightBall {
	//attributes ... needs a series of responses
	private String[] responses; 
	
	//constructor ... to initialize variables
	public MagicEightBall()
	{
		responses = new String[10];
		responses[0] = "Don't count on it";
		responses[1] = "My reply is no";
		responses[2] = "My sources say no";
		responses[3] = "Outlook not so good";
		responses[4] = "Very doubtful";
		responses[5] = "It is certain";
		responses[6] = "Without a doubt";
		responses[7] = "As I see it, yes";
		responses[8] = "Signs point to yes";
		responses[9] = "Reply hazy try again";
	}
	
	//methods ... we need to shake it and produce a response
	public String shake()
	{
		Random generator = new Random();
		int response = generator.nextInt(10);
		return responses[response];
	}

}
