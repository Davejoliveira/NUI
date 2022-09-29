import java.util.Scanner;
public class LeapYear{

	// Main method
    public static void main(String[] args) {

    	// Variable
    	int year;
    	
    	// User input
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = scan.nextInt();
        
    	boolean leapTrue = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                	leapTrue = true;
                else
                	leapTrue = false;
            }
            else
            	leapTrue = true;
        }
        else {
        	leapTrue = false;
        }

        if(leapTrue==true)
            System.out.println("The Year " + year + " is a Leap Year.");
        else
            System.out.println("The Year " + year + " is a not Leap Year.");
    }
}
