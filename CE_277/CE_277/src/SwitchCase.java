import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter Your Year Of Birth: ");
            int YOB = input.nextInt();

            switch (YOB%12) {
                case 0:
                    System.out.println("Your Zodiac animal is Monkey");
                    break;
                 case 1:
                    System.out.println("Your Zodiac animal is rooster");
                    break;
                 case 2:
                    System.out.println("Your Zodiac animal is dog");
                    break;
                 case 3:
                    System.out.println("Your Zodiac animal is pig");
                    break;
                 case 4:
                    System.out.println("Your Zodiac animal is rat");
                    break;
                 case 5:
                    System.out.println("Your Zodiac animal is ox");
                    break;
                 case 6:
                    System.out.println("Your Zodiac animal is tiger");
                    break;
                 case 7:
                    System.out.println("Your Zodiac animal is rabbit");
                    break;
                 case 8:
                    System.out.println("Your Zodiac animal is dragon");
                    break;
                 case 9:
                    System.out.println("Your Zodiac animal is snake");
                    break;
                 case 10:
                    System.out.println("Your Zodiac animal is horse");
                    break;
                 case 11:
                    System.out.println("Your Zodiac animal is sheep");
                    break;
            
                default:
                    System.out.println("You belong to my year group!!!!!");
                    break;
            }


        input.close();
      //   Assignment 
      // rewrite using the if-else statement
    }
    
}