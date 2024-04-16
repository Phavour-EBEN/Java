import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
       
        String filePath = "C:\\Users\\Phavour\\OneDrive\\Desktop\\File1.txt"; // Specify the path to your Test.txt file

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); // Print each line from the file
            }

            scanner.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
