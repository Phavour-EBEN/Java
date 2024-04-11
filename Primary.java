import java.util.Scanner;

public class Primary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature in Degree: ");
        double degree = input.nextDouble();

        double fah =(degree*(5/9))+32;

        System.out.println("Temperature in Fahrenheit: " + fah);

        System.out.println("Enter height in feet: ");
        double feet = input.nextDouble();

        double meters = 0.305*feet;

        System.out.println("Heihgt in meter: " + meters);
    }
}
