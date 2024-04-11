public class UmatTest {
    public static void main(String[] args) {
        Umat stud = new Umat("Evans",1995,"TK");
        Umat stud1 = new Umat("ACESS0","CE",3,78.67);
        Umat stud3 = new Umat();

        System.out.println(stud1.CWA(80.03));
        System.out.println(stud1.CWA());

       System.out.println(stud3.CWA(90));
       System.out.println(stud.Gender("male"));
    }
}
