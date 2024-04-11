public class MathsFunctions {
    public static void main(String[] args) {
//            constants
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(2*Math.PI);

//        trigFunction
        System.out.println("Trig function ");
        System.out.println(Math.cos(90));/* not right convert to radians*/
        System.out.println(Math.cos(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(90)));
//        assignmnet asin,acos,atan
//        exponent
        System.out.println(Math.exp(5));/* means constant E to the power 5 */
        System.out.println(Math.log(15));/*the ntural log of 15*/
        System.out.println(Math.log10(15));/*log to the base 10 find the base 2(other bases)*/
        System.out.println(Math.log1p(15));
        System.out.println(Math.pow(5,7));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(25,1.0/7));/*finding the 7th root */
        System.out.println(Math.pow(27,1.0/3));/*finding the cube root */

//        rounding methods
        System.out.println("roundng methods");
        System.out.println("ceil: "+Math.ceil(89.7952));/*roundup to the nearest integer*/
        System.out.println("ceil: "+Math.ceil(89.1952));
        System.out.println("ceil: "+Math.ceil(89.1));


        System.out.println("floor: "+Math.floor(89.7952));/*rounddown to the nearest integer*/
        System.out.println("ceil: "+Math.floor(89.1952));


        System.out.println("rint: "+Math.rint(89.7952));/*round to the nearest integer base on the number after the decimal point*/
        System.out.println("ceil: "+Math.rint(89.1952));


        System.out.println("round: "+Math.round(89.7952));/*roundup to the nearest integer*/
        System.out.println("round: "+Math.round(89.1952));

        double x = 1.0/3;
        double x1 =Math.round(x*1000)/1000.0;
        System.out.println(x1);
//        max/min
        System.out.println(Math.abs(-59));
        System.out.println(Math.min(1.35,-555));
//        random number
        double randNum = Math.random();
        System.out.println(randNum);
        System.out.println((int)(randNum*5));
        System.out.println(3*6%5+6/3-8);

        char m = 'a';
        System.out.println((int)m);


    }
}
