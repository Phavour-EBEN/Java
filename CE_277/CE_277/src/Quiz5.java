

public class Quiz5{
    public static void main(String[] args) {
    double[][] Quiz = {{3,80},{2,93},{1,75},{3,82}};
    
    double sum = 0.0;
    
    for(int i =0;i<Quiz.length;i++){
        sum += Quiz[i][1]*Quiz[i][0];

    }
    double totalCreditHour = 0.0;
    System.out.println(sum);
    for(int i =0;i<Quiz.length;i++){
        totalCreditHour +=Quiz[i][0];
    }

    
}
}