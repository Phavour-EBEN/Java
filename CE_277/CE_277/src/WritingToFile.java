import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFile {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter output = new PrintWriter("out.txt");

        output.println("Nana bee is lonely");
        output.println("Because she is absent");
        output.close();
        // read the content of a file and write it in uppercase in another file
    }
}
