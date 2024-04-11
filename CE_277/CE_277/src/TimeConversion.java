import java.text.*;
import java.util.*;
import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args) {

        Date cDate = new Date();
        System.out.println(cDate);

        String cdt = new SimpleDateFormat("yyyy MM dd HH mm ss").format(new Date());
        System.out.println(cdt);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in second(s): ");
        long timeInSec = input.nextLong();
//        System.out.println(timeInSec);
//        converting sec(s) to min(s)
        long timeInMins = timeInSec/60;
        long remainingMin = timeInSec%60;
//        System.out.println(timeInMins+" min(s) "+remainingMin+" sec(s).");
//        converting min(s) to hr(S)
        long timeInHrs = timeInMins/60;
        long remainingHours = timeInMins%60;
        long remainingMins = timeInSec%60;
//        System.out.println(timeInHrs+" hr(s) "+remainingHours+" min(s) "+remainingMins+" sec(s) ");
//        converting hours to days
        long timeInDays = timeInHrs/24;
//        System.out.println(timeInDays +" day(s) "+timeInHrs+" hr(s) "+remainingHours+" min(s) "+remainingMin+" sec(s)");
        long timeInMonths = timeInDays/31;
//        System.out.println(timeInMonths+" months "+timeInDays +" day(s) "+timeInHrs+" hr(s) "+remainingHours+" min(s) "+remainingMin+" sec(s)");
        long timeInYear = timeInMonths/12;
        System.out.println(timeInYear+" year(s) "+timeInMonths+" months "+timeInDays +" day(s) "+timeInHrs+" hr(s) "+remainingHours+" min(s) "+remainingMin+" sec(s)");
    }
}
