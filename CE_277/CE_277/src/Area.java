import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        double height = input.nextInt();
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextInt();

//        computing the area of the triangle
        double area = 0.5*base*height;

        System.out.println("The area is : "+area);

    }
}
