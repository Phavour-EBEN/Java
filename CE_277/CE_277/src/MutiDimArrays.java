import java.util.Arrays;

public class MutiDimArrays {
    public static void main(String[] args) {
//        creating two dimensionArray
//        Dimension must not exceed 255
        double[][] marks = new double[5][2];
//        creating and initializing
        int[][] ages = {{19, 21, 25}, {26, 29, 26}, {30, 33, 31}};

//        adding content without looping
//        marks[0][0]=2.9;
//        marks[0][1]=3.5;
//        displaying content
        System.out.println(Arrays.deepToString(marks));
        System.out.println(Arrays.deepToString(ages));

        System.out.println(marks.length);
        System.out.println(marks[2].length);


        System.out.println("----Adding content using the loop----");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                marks[i][j] = Math.random() * 25;
            }
//            System.out.println(Arrays.toString(marks[0]));

        }
        System.out.println(Arrays.deepToString(marks));
        System.out.println("getting content");

        double x = marks[0][1];
        System.out.println(x);
//        displaying line by line
        // for(){}

//        jagged arrays
        int stMarks[][]= {{19, 21, 25,56,49,20}, {26, 29, 26,48}, {30, 33, 31}};
        System.out.println(Arrays.deepToString(stMarks));
    }
}
