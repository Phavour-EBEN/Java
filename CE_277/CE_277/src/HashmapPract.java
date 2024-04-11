import java.util.HashMap;
import java.util.Map;

public class HashmapPract {
    public static void main(String[] args) {
//        creating hashmap
        Map<String,Integer> stAges =new HashMap<>();
        HashMap<Integer,Integer> stdDetails = new HashMap<>();


//        adding
        System.out.println("Adding contents");
        stAges.put("Nana",23);
        stAges.put("Ebela",20);
        stAges.put("Esi",25);
        stAges.put("Araba",35);
        stAges.put("Roy",45);
        stAges.put("Nana",30);
        System.out.println(stAges);

        System.out.println(stAges.containsKey("Kofi"));
        

    }
}
