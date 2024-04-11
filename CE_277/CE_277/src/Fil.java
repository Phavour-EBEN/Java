import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fil {
    public static void main(String[] args) {
        File inputFile = new File("Text.txt");
        Scanner input = null;
        try {
            input = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        while (input.hasNext()) {
            if(input.hasNextInt()){
                int x = input.nextInt();
                System.out.println(x+" is an integer");
            }else if(input.hasNextDouble()){
                Double y = input.nextDouble();
                System.out.println(y+" is a dec");
            }else if(input.hasNextBoolean()){
                boolean k = input.nextBoolean();
                System.out.println(k+" is a boolean");
            }else{
                String str = input.next();
                System.out.println(str);
            }
        }
    }
}
