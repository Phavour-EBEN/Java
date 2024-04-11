import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // while loop
        // will execute while the condition is true
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number of multiple");
        // int number = input.nextInt();
        // int count = 1;
        // while(count<number){
        //     System.out.println((count * 2));

        //     count++;
        // }
        // input.close();
        int value = 1;
        int check = 0;
        System.out.println("Numbers div by both 3 and 7");
        while (value <1000) {
            if((value%3==0)&&(value%7==0)){
                System.out.println(value);
                check++;
            }
            if(check==20)
                break;

            value++;
        }
        // sum of 10 pos integers
        int sum = 0;
        for(int count1=1;count1<=10;count1++){
            sum = sum+count1;
            
        }
        System.out.println("sum of first 10 pos integers :      "+sum);

    }
}
