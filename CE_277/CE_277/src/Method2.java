public class Method2 {
    public static void main(String[] args) {
        int A = 25;
        int B = 20;
        int Z =67;

        int result = Add(A, B);
        System.out.println(result);
        int zy = Add(A,Z);
        System.out.println(zy);
        System.out.println(Sub(A,B));

        System.out.println(mul(99,98,77));

        sumOfARange(45,50);




    }

    private static void sumOfARange(int a, int b) {
        int sum = 0;
        if(a>b){
            System.out.println("out of range");
        }
        for(int x=a;x<=b;x++){
            sum = sum+x;
        }
        System.out.println(sum);
    }

    private static int Add(int x, int y) {
        int result = x + y;
        return result;
    }
    public static int Sub(int x1, int y1){

        return x1-y1;

    }
    public static int mul(int x2, int y2, int z2){
        return x2*y2*z2;
    }

}
