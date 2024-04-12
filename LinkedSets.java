import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSets {
    public static void main(String[] args) {
        
        Set<String> names = new LinkedHashSet<>();
        Set<String> names1 = new LinkedHashSet<>();

        names.add("George");
        names.add("Tim");
        names.add("John");
        names.add("Blake");
        names.add("Kelvin");
        names.add("Michael");
        System.out.println(names);

        names1.add("George");
        names1.add("Katie");
        names1.add("Kelvin");
        names1.add("Michelle");
        names1.add("Ryan");
        System.out.println(names1);

        names.addAll(names1);
        System.out.println(names);
        names.retainAll(names1);
        System.out.println(names);
    }
}
