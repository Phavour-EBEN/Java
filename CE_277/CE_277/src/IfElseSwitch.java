import java.util.Scanner;
public class IfElseSwitch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Year Of Birth: ");
        int YOB = input.nextInt(); 

        String zodiac[] ={"Monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake"," horse","sheep"};

        if(YOB%12==0){
            System.out.println("You were born in the year of the "+zodiac[0]);

        } else if (YOB%12==1) {
            System.out.println("You were born in the year of the "+zodiac[1]);
        }
        else if (YOB%12==2) {
            System.out.println("You were born in the year of the "+zodiac[2]);
        }
        else if (YOB%12==3) {
            System.out.println("You were born in the year of the "+zodiac[3]);
        }
        else if (YOB%12==4) {
            System.out.println("You were born in the year of the Rat");
        }
        else if (YOB%12==5) {
            System.out.println("You were born in the year of the OX");
        }
        else if (YOB%12==6) {
            System.out.println("You were born in the year of the Tiger");
        }
        else if (YOB%12==7) {
            System.out.println("You were born in the year of the Rabbit ");
        }
        else if (YOB%12==8) {
            System.out.println("You were born in the year of the Dragon");
        }
        else if (YOB%12==9) {
            System.out.println("You were born in the year of the Snake");
        }
        else if (YOB%12==10) {
            System.out.println("You were born in the year of the Horse");
        }
        else{
            System.out.println("You were born in the year of the Sheep");
        }
        input.close();
    }
}