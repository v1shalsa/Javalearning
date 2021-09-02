package com.timeconversion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String tz = s.substring(8);
        String timepart1 = s.substring(0,2);
        String timepart2 = s.substring(2,8);
        String op = "";
        System.out.println(tz);
        System.out.println(timepart1);
        System.out.println(timepart2);
        if(tz.equals("PM")){
            int hour = Integer.parseInt(timepart1);
            if(hour<12)hour+=12;
            op =  String.valueOf(hour).concat(timepart2);
        }else {
            int hour = Integer.parseInt(timepart1);
            if(hour==12)timepart1="00";
            //op =  String.valueOf(hour).concat("0");
            op = timepart1.concat(timepart2);
        }
        System.out.println(op);
        return "";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
