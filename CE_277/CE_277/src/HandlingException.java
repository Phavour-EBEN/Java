import java.util.InputMismatchException;
import java.util.Scanner;
public class HandlingException {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // surrounding it while loop
        int tries = 3;

        
       
        while (true) {

        // System.out.print("Enter  value for x: ");
        // int x = input.nextInt();
            

        if(tries==0)
            break;
        tries--;
        // int z=x/y;

        // System.out.println(x+" / "+y +" is : "+z);
/* 
        System.out.println(2.1/0);
        System.out.println(-2.1/0);
        System.out.println(0.0/0);
*/
/*In this case, inserting a double would throw a NumberFormatException, 
an exception which is thrown when it can't properly format the integer. */
    
        try {
            System.out.print("Enter  value for x: ");
            int x = input.nextInt();

            System.out.print("Enter a value for y: ");
            int y = input.nextInt();
        

            double z = x/y;
            System.out.println(x+" / "+y +" is : "+z);
            break;
        } catch (ArithmeticException e) {

                System.out.println("Error: cannot divide by zero");
    
                System.out.println("You have "+tries+" left. ");
            
        } catch(InputMismatchException e){
            System.out.println("Excepting an integer!!!");
            // break;
        }
    }
    
        input.close();
    
    }
    
}
