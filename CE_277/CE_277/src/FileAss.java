import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAss {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\Administrator\\OneDrive\\Desktop\\vs code\\Java Programming\\CE_277\\File1.txt");
        PrintWriter outputFile = new PrintWriter("Output.txt");

        Scanner input = new Scanner(inputFile);
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
            String text = input.nextLine();
            String upperCase = text.toUpperCase();
            outputFile.println(upperCase);
        }
        input.close();

       
        outputFile.close();
        System.out.println(outputFile);
    }
}
