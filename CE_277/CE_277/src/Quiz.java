import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\Administrator\\OneDrive\\Desktop\\vs code\\Java Programming\\CE_277\\Quiz1.txt");
        PrintWriter output = new PrintWriter("OutputFile.txt");
        int[] collection = new int[7];
        Scanner input=null;
        try {
            input = new Scanner(inputFile);
            
            System.out.println(input.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found");
        }
        while (input.hasNext()) {
            if(input.hasNextInt()){
                int x = input.nextInt();

                System.out.println(x);

            }else{
                String str = input.next();
                System.out.println(str);
            }

        }


        
        
        
    }
}
