public class CharStrings{
    public static void main(String[] args) {

    // string data type
    String fname = "KWABENA";
    String Lname = "Kwabena";
    String string1 = "I love programming in java";
    String string2 = "Something is about to go down";
    System.out.println(fname.compareToIgnoreCase(Lname));

    System.out.println(string1.substring(7));
    System.out.println(string2.substring(12, 18));

    System.out.println(fname);
    System.out.println(fname.equalsIgnoreCase("nana"));

    System.out.println(fname.contains("a"));
    int ch = 91;
    System.out.println((char)(ch));
    String name = "Mensah Bilson";
    String lName  = " ";

    name = name.stripTrailing();

    System.out.println("\"Ebela\" is here !!.\nAlright");
    System.out.println("aaa"+name+lName);

    System.out.println(name.replace(" ", ""));
    
    }
}