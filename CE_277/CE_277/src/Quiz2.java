import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
//        int number[] = new int[100];
        for(int i=30;i<61;i++){
            if((i%4==0)||(i%3==0)){
                System.out.println(i);
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter side : ");
        double s = input.nextDouble();
        double area=(s*Math.pow(6,2)/(4*Math.tan(Math.PI/6)));
        System.out.println(area);
        input.close();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
       


    }

}
