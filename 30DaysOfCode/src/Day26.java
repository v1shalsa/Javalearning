import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) throws ParseException {
        Scanner in  = new Scanner(System.in);

        String ret = in.nextLine();
        String due = in.nextLine();

        String[] retd = ret.split(" ");
        String[] dued = due.split(" ");

        int retdday = Integer.parseInt(retd[0]);
        int retdmth = Integer.parseInt(retd[1]);
        int retdyr = Integer.parseInt(retd[2]);
        int duedday = Integer.parseInt(dued[0]);
        int duedmth = Integer.parseInt(dued[1]);
        int duedyr = Integer.parseInt(dued[2]);

        int mdiff = retdmth - duedmth;
        int ddiff = retdday - duedday;
        int ydiff = retdyr - duedyr;
        int diff=(retdyr-duedyr>0)?10000:(retdmth-duedmth>0&&ydiff==0)?mdiff*500:(retdday-duedday>0 && ydiff==0)?ddiff*15:0;

        System.out.println(diff);
    }
}

//31 12 2015
//01 01 2016
