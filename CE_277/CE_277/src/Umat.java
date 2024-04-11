public class Umat {
    private String name = "Student";
    private int YearOfBirth = 2000;
    private String HomeTown = "Student";
    private String Dept = "Student";
    private String program = "Student";
    private String index = "";
    private int YearOfStudy = 1;
    private double CWA = 0.0;
    private String Gender = "M / F";

    Umat(){
        this.Gender = Gender;
    }

    
    Umat(String name, int YearOfBirth, String HomeTown){
        this.name = name;
        this.YearOfBirth = YearOfBirth;
        this.HomeTown = HomeTown;
        
    }

    Umat(String Dept,String program,int YearOfStudy, double CWA){
        this.Dept=  Dept;
        this.program = program;
        this.YearOfStudy = YearOfStudy;
        this.CWA = CWA;
    }

    String name(){
        return name;
    }
    int YearOfBirth(){
        return YearOfBirth;
    }
    String HomeTown(String hometown){
        return hometown;
    }
    String Gender(String gender){
        return gender;
    }
    
    String index(String update){
        return update;
    }
    int YearOfStudy(){
        return YearOfStudy;
    }
    int YearOfStudy(int update){
        return update;
    }
    double CWA(){
        return CWA;
    }
    double CWA(double update){
        return update;
    }
    String ChangeDeptChangeProgram(String dept){
        return dept ;
    }

}
