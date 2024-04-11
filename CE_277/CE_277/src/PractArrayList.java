import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PractArrayList {
    public static void main(String[] args) {
//        creating arraylist
        ArrayList<String> stuNames = new ArrayList<String>();
        ArrayList<String> homeTown = new ArrayList<>();
        ArrayList<Double> stuMark = new ArrayList<>();
        ArrayList<String> newName = new ArrayList<>();



        System.out.println(stuMark.size());
//        Adding content
        stuNames.add("Ama");
        stuNames.add("Mike");
        stuNames.add("20.24");
        stuNames.add("Nana");
        stuNames.add("E");

        homeTown.add("Nzema");
        homeTown.add("cape");
        homeTown.add("Camp city");
        homeTown.add("Winneba");



        System.out.println(stuNames.size());

//        using a oop to add content
        for(int i =0;i<100;i++){
//            multiple of 3 and 4
            if((i%3==0)&&(i%4==0)){
                stuMark.add((double)i);
            }

        }
        System.out.println(stuMark);
        System.out.println(stuNames);
        System.out.println(homeTown);
//        removing content
//        stuNames.remove("20.24");
        System.out.println(stuNames);
        stuNames.add(1,"kofi");
        System.out.println(stuNames);
//        checking for item
        System.out.println(stuNames.contains("nana"));

//        getting an item with an index
        System.out.println(stuMark.get(1));
//        souting
        System.out.println("before sorting");
        System.out.println(stuNames);
        System.out.println("after sortng");
        Collections.sort(stuNames);
        System.out.println(stuNames);
        Collections.reverse(stuNames);
//        reversing the content
        System.out.println(stuNames);
//      adding all content
        newName.add("Araba");
        newName.add("Selasi");
        System.out.println(newName);
        newName.addAll(stuNames);
        System.out.println("after adding all");
        System.out.println(newName);
    }
}
