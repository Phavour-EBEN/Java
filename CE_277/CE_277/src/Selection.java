import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        // create scanner varable
        Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            // if a module division of num by 2==0? "even":"old"
            /*One way
            if(number %2!=0){
                System.out.println(number+" is old");
            } */

            if(number%2==0){
                System.out.println(number+" is even");
            }else{
                System.out.println(number+" is odd");
            }

// closing scanner variabe
        input.close();
    }
}
