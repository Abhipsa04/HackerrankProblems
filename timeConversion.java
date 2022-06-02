import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String[] time = s.split(":"); 
         //System.out.println(time[0]);
         // extracting the hour a
         int hour = Integer.parseInt(time[0]);
       char amOrPm = s.charAt(s.length()-2);
      
      if(amOrPm == 'A'){
          if(hour==12){
            time[0]="00";
            String str1 = (time[0]+":"+time[1]+":"+time[2]);
         // taking the str upto before p
            String finalstr1 = str1.substring(0,str1.length()-2);
            return finalstr1;   
          }
          return s.substring(0,s.length()-2);
      }
      else if(amOrPm == 'P'){
          if(hour==12){
            time[0]="12";
            String str2 = (time[0]+":"+time[1]+":"+time[2]);
         // taking the str upto before p
            String finalstr2 = str2.substring(0,str2.length()-2);
            return finalstr2;   
          }
         hour+=12;
         time[0] = Integer.toString(hour);
         //System.out.println(time[0]);
         // join method not working
         //String str = String.join(":",time[0],time[1],time[2]);
         String str = (time[0]+":"+time[1]+":"+time[2]);
         // taking the str upto before p
         String finalstr = str.substring(0,str.length()-2);
         //System.out.println(finalstr);
         return finalstr;
      }
      return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
