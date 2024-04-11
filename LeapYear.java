import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.print("Enter a year to check if it is a leap year: ");
        Scanner input  = new Scanner(System.in);
        int yaer = input.nextInt();
        if (yaer % 4 == 0 && yaer % 100 != 0 || yaer % 400 == 0) {
            System.out.println(yaer + " is a leap year");
        }else {
            System.out.println(yaer + " is not a leap year");
        }
    
    }
}