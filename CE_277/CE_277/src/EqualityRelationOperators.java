public class EqualityRelationOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 31;

        System.out.println(Math.floor(65.25));
//        check eqality opertors
        System.out.print("Is "+a+" equal to "+b+"? ");
        System.out.println(a == b);

        System.out.print("Is "+a+" not equal to "+b+"? ");
        System.out.println(a != b);

//        Relational operators
        System.out.print("Is "+a+" less than "+b+"? ");
        System.out.println(a < b);

        System.out.print("Is "+a+" greater than "+b+"? ");
        System.out.println(a > b);

//        Ternary operator ? (writing a one line if else statement)
        int x = (a<b) ? 40:80;
        System.out.println(x);
    }
}
