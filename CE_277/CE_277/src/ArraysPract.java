import java.util.Arrays;

public class ArraysPract {
    public static void main(String[] args) {
        // create a SDA of double
        double marks[] = new double[5];
        // create a SDA of int
        int[] ages = new int[6];
        // create a SDA of string
        String[] stName = new String[10];

        // Adding content to an Array of double
        double dist[] = {0.9,65,65.9,9};
        // display the content
        System.out.println("Before content addition");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(stName));
        System.out.println(Arrays.toString(dist));
        System.out.println("---------------------");

        marks[3] = 45.3;
        for(int i=0; i<marks.length;i++){
            marks[i] = 34*i*Math.random();
        }
        System.out.println("After content addition");
        System.out.println(Arrays.toString(marks));

        for(int j=0;j<stName.length;j++){
            stName[j]="student"+j;
        }
        System.out.println(Arrays.toString(stName));
        System.out.println("---------------------");

        for(int k=0;k<15;k++){
            try {
                System.out.println(marks[k]);   
            } catch (Exception e) {
                break;
                // System.out.println("Arrays out of bound");

            }
            
        }

        // copy a SD in Java pointing to same data
        System.out.println("Before the copy");
        System.out.println(Arrays.toString(marks));
        System.out.println("---------------------");

        double[] copylist = Arrays.copyOf(marks,marks.length);
        System.out.println(Arrays.toString(copylist));
        double newMarks[] = marks; 
        System.out.println(Arrays.toString(newMarks));

        
        newMarks[0]=3;
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(newMarks));
        System.out.println(Arrays.toString(copylist));

        // sorting of arrays
        System.out.println("--------sortng of Arrays--------");
        
        int start = 2;
        int end = 4;
        
        Arrays.sort(copylist);
        Arrays.sort(marks,start,end);
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(copylist));


/*
        int[] digits = new int[10];
        for(int i=0;i<digits.length;i++){
            digits[i] = Math.random()*20;
sorting from beginning to the last element
 */
        }


    }

