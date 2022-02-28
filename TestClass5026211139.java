import java.util.Scanner;
public class TestClass5026211139 {
	public static void main(String[] args) {
		ComputeMethods5026211139 comp = new ComputeMethods5026211139();
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Temperature (in Fahrenheit) : ");
			double degreesF = sc.nextDouble();

			System.out.print("Input a : ");
			int a = sc.nextInt();
			System.out.print("Input b : ");
			int b = sc.nextInt(); 
			
			System.out.println("Temp in celcius is : "+comp.fToC(degreesF));
			System.out.println("Hypotenuse is : "+comp.hypotenuse(a,b));
			System.out.println("The sum of the dice is : "+comp.roll());
    }
}