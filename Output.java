public class Output {
    public static void main(String[] args) {
        //finding the output of count after the sequence of operations
        int count =3;
        count= 1-2*count;
        count = count-2;
        System.out.println(count);
        
        //corrcting some errors
        String mesg = "Welcome to Java Programming";
        System.out.println(mesg.substring(4,5));
        System.out.println(mesg.substring(15,20));

        System.out.println("John said \"Java is fun and easy\"");
        System.out.println("John said \'Java is fun and easy\'");

        // System.out.println(1 / 0);//will throw an error when trying to execute the command
        System.out.println(1.0 / 0);
    }
}
