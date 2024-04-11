import java.util.HashSet;
import java.util.Set;

public class SetsAndMaps {
    public static void main(String[] args) {
//        creation of hashsets
    Set<Integer> stdAge = new HashSet<>();
    HashSet<String> stName = new HashSet<>();
    HashSet<String> stName1 = new HashSet<>();
    HashSet<String> stName2 = new HashSet<>();
    HashSet<Double>stdMarks = new HashSet<>();

//    Adding content to hashset
        stdAge.add(20);
        stdAge.add(48);
        stdAge.add(55);

        stdMarks.add(43.6);
        stdMarks.add(55.89);
        stdMarks.add(89.9);

        stName.add("Esi");
        stName.add("Araba");
        stName.add("Andy");
        stName.add("Ebela");
        stName.add("Nana");

        stName1.add("Esi");
        stName1.add("Araba");
        stName1.add("Andy");

        stName2.add("Ebela");
        stName2.add("Nana");
        stName.add("Kofi");
        stName.add("chales");

        System.out.println(stdAge);
        System.out.println(stdMarks);
        System.out.println(stName);
        System.out.println("After modification");
        stName.addAll(stName1);
        System.out.println(stName1);
        System.out.println(stName);
//        set intersection
        System.out.println("intersection modification");
        stName.retainAll(stName2);
        System.out.println(stName);

        //set sub
        stName.removeAll(stName2);
        System.out.println(stName);
        System.out.println(stName2);

    }
}
