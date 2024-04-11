import java.util.Scanner;

public class UmatGrades {
    public static void main(String[] args) {
        // create scanner variable
        Scanner input = new Scanner(System.in);
        // Ask user to enter marks
        System.out.print("Enter your Grade: ");
        double grade = input.nextDouble();
        if ((grade > 100) || grade < 0) {
            System.out.println("Invalid Grade");
        } else {
            if (grade >= 80.0) {
                System.out.println("You are in the First Class");
            } else if ((grade >= 70.0) && (grade < 80.0)) {
                System.out.println("You are in the Second Class Upper");
            } else if ((grade >= 60.0) && (grade < 70.0)) {
                System.out.println("You are in the Second Class Lower");
            } else if ((grade >= 50.0) && (grade < 60.0)) {
                System.out.println("You are in the Pass Zone");
            } else {
                System.out.println("You failed");
            }

        }

        input.close();
    }
}
