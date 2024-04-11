public class Quiz3 {
    public static void main(String[] args) {
        double[] nums = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0,16.0,18.0,19.0,20.0};
        double sum = 0.0;
        double avg = 0.0;
        for(int i = 0;i<nums.length;i++){
            sum = sum +nums[i];
        }
        avg = sum/nums.length;
        System.out.println(avg);
    }
    
}
