public class SumOfOddNum {
    public static void main(String[] args) {
        //finding the sum of all odd numbers between 1 and 100 inclusive
        // int sum = 0;
        // for (int i = 1; i <= 100; i++) {
        //     if (i % 2 != 0) {
        //         sum += i; // Add odd numbers to the sum
        //     }
        // }

        // System.out.println("Sum of odd numbers between 1 and 100: " + sum);

        int count = 1;
        double totalcube = 0;
        while ((count<=25)) {
            totalcube +=Math.pow(count,3);
            count++;
        }
        System.out.println(totalcube);

        int x =3;
        int y = 5;
        int z = 10;

        System.out.println( ++z+y-y+z+x++);

        byte n =64;
        int i;
        byte m;


        i =n<<2;
        System.out.println(i);
    }
}
