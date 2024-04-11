import java.util.Random;

public class RandomMonth {
    public static void main(String[] args) {
        Random monthNumber = new Random();

        int month = monthNumber.nextInt(12) + 1;
        System.out.println(month);
    }
}
