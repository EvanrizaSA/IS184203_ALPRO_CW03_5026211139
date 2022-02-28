import java.util.Random;

public class ComputeMethods5026211139{
	
    //Temperature
	public double fToC(double degreesF){

		return 5/9.0*(degreesF - 32);
	}

    //Hypotenuse
	public double hypotenuse ( int a, int b){

		return Math.sqrt((a*a) + (b*b));
	}

    //Dice-rolling
	public int roll ()	{
		Random rndm = new Random();
		int diceA = rndm.nextInt(6)+1;
		int diceB = rndm.nextInt(6)+1;
		return diceA + diceB;
	}

}