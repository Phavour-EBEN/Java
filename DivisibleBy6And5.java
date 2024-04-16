public class DivisibleBy6And5 {
    public static void main(String[] args) {
        //write a java code that when run display the first 20 positive numbers that are divisible by 6 and 5 but not both
        for(int i = 0; i < 20; i++) {
            if(i % 6 == 0 && i % 5 == 0) {
                }
            else {
                System.out.println(i);
            }
        }
    }
}
