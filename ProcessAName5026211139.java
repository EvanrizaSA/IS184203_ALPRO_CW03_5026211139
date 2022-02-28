
import java.util.Scanner;


public class ProcessAName5026211139 {
    
    public static void main(String[] args) {

            Scanner console = new Scanner(System.in);
            System.out.print("What's your name? : ");
            String FullName = console.nextLine();
            int SpaceIndex = FullName.indexOf(' ');
            String LastName = FullName.substring(SpaceIndex+1);
            System.out.println("Hello, Sir : " +LastName+ ", " +FullName.charAt(0)+ ".");


    }
}
