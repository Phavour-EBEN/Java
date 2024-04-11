import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class ErrorHandling {
    public static void main(String[] args) {
        Date  today = new Date();
        System.out.println(today);
        Scanner input=  new Scanner(System.in);
        boolean contInput = true;

        try {
            int value = 50;
            if (value < 40)
                throw new Exception("value is too small");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");

/*
        do {
            try {
                System.out.println("Please enter a number(Integer): ");
                int n = input.nextInt();
                contInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Not Supported");
                input.nextLine();
            }
        } while (contInput);
* */
    }

}
