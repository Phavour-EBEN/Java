public class RectangleMeth {

    private double length = 1.0;
    private double breadth = 1.0;
    private double height = 1.0;

    RectangleMeth(){

        }

    /**
     *
     * @param l
     * @param b
     */

    RectangleMeth(double length, double breadth , double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    RectangleMeth(double length, double breadth){
        this.length = length;
        this.breadth = breadth;

    }
    double length(){
        return length;
    }
    double sideLeftArea(){
        return height*breadth;
    }
    double topSideArea(){
        return length*breadth;
    }
    double findVolume(){
        return length*breadth*height;
    }




}



