package ArrayReview;
import hsa.*;


public class RunningTimes {

    public static Console c;
    
    public static void main(String[] args) {
        c = new Console();
        String athletes[] = {"BOB", "SUE", "JOE", "AMY"};
        //2d parallel ragged array
        double times[][]={
        {18.2,19.1,18.3},
        {17.5},
        {21.5,21.2,20.5,20.1,19.5},
        {19.5,18.9}
        };
        //get average for each athlete
        double avg[] = getAvg(times);
        //print all the results
        for (int x = 0; x < athletes.length; x++) {
            c.print(athletes[x] + "\t\t");
            //print times for eavh athlete
            for (int y = 0; y < times[x].length; y++) {
                c.print(times[x][y] + ",");
            }
            c.println("\tAverage = " + avg[x]);
        }
    }
    public static double[] getAvg(double t[][]){
        //create array to send back
        double result[] = new double[t.length];
        //go to each row and find the average
        for (int i = 0; i < t.length; i++) {
            double sum=0;
            for (int j = 0; j < t[i].length; j++) {
                sum += t[i][j];
            }
            result[i] = sum/t[i].length;
        }
        return result;
    }
    
}
    

