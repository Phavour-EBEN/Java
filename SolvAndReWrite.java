public class SolvAndReWrite {
    public static void main(String[] args) {
        int x =3; int y = 4;
        int z = x+2*y;

        if(z==4){
            y -=2*x%y;
        }else if(z==5){
            y+=x+3%y;
        }else if (z==6) {
            y+=x%y;
        }else{
            y+=x-y;
        }
        System.out.println(y);
        //rewriting the if-else statement to switch case
        switch (z){
            case 4:
                y -=2*x%y;
                break;
            case 5:
                y+=x+3%y;
                break;
            case 6:
                y+=x%y;
                break;
            default:
                y+=x-y;
                break;
    }
    System.out.println(y);

    }
}
