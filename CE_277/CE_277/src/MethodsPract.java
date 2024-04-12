

import java.util.ArrayList;

public class MethodsPract {
    public static void main(String[] args) {
        ArrayList<Double> stuMark = new ArrayList<>();
        ArrayList<Double> stdAges = new ArrayList<>();

//        using a oop to add content
        multipleOf3And4(stuMark);
        System.out.println(stuMark);
//        print();

    }
    public  static void print(ArrayList<Double> kofi){
        for(int i=0;i<kofi.size();i++){
            System.out.println(kofi.get(i));
        }
    }


    private static void multipleOf3And4(ArrayList<Double> stuMark) {
        for (int i = 0; i < 100; i++) {
//            multiple of 3 and 4
            if ((i % 3 == 0) && (i % 4 == 0)) {
                stuMark.add((double) i);
            }
        }
    }
    private static void multipleOf3And(ArrayList<Double> stuMark) {
        for (int i = 0; i < 100; i++) {
//            multiple of 3 and 4
            if ((i % 3 == 0) && (i % 4 == 0)) {
                stuMark.add((double) i);
            }
        }
    }

}
