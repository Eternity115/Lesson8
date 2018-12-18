package ArrayReview;
import hsa.*;

public class Attendance {

    public static Console c;
    
    public static void main(String[] args) {
        c = new Console();
        //2d ragged attendance array
        //a 2d array where each inner array is a different length
        String attendance[][] ={
            {"JOE", "S09", "S12", "o14"},
            {"AMY"},
            {"SUE", "s24"},
            {"BOB", "s05", "s23", "o11", "o12", "o23"}      
        };
        //count days away
        int abs[] = countabs(attendance);
        //print attendance
        for (int i = 0; i < attendance.length; i++) {
            c.print("Total Absences: " + abs[i] + "\t");
            for (int j = 0; j < attendance[i].length; j++) {
                c.print(attendance[i][j] + "\t");
            }
            c.println(); //forces new line next Student
        }
        c.print("\n\nEnter name of student for absences: ");
        String name = c.readLine();
        String dates[] = getDates(attendance,name);
        if (dates.length>0){
            for (int i = 0; i < dates.length; i++) {
                c.print(dates[i] + "\t");
            }
        }
        else c.println("No data found");
    }
    public static String[] getDates(String data[][], String name){
        String dates="";
        for (int i = 0; i < data.length; i++) {
            if(name.equals(data[i][0])){ //WE HAVE A MATCH
                //build a list of all the dates in that row
                //starting at location 1 to the end
                for (int j = 0; j < data[i].length; j++) {
                    dates += data[i][j] + ",";
                }
            }
        }
        if (dates.length()>0) //we have dates
            return dates.split(",");
        else //no dates or no match found
            return new String[0];
    }
    public static int[] countabs(String data[][]){
        int results[] = new int [data.length];
        for (int i = 0; i < data.length; i++) {
            results[i] = data[i].length - 1;
        }
        return results;
    }
    
}
