import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        // reading file in the project
        File inputFile = new File("C:\\Users\\Administrator\\OneDrive\\Desktop\\TextDesk.txt");
        File projectFile = new File("TextFile");

        System.out.println(inputFile.exists());
        System.out.println(inputFile.length());

        System.out.println(projectFile.exists());

        System.out.println(projectFile.length());
        // absoluepath()
        // canonical()

        File fileToDel = new File("C:\\Users\\Administrator\\OneDrive\\Desktop\\vs code\\Java Programming\\CE_277\\DocumentDelect.txt");
        fileToDel.delete();

        // Scanner input = new Scanner(inputFile);
        // // Open text file and read content
        // while(input.hasNextLine()){
        //     System.out.println(input.nextLine().toUpperCase());

        // }
        // input.close();
    }
}
