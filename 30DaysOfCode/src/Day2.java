import java.util.Scanner;

public class Day2 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double d = input.nextDouble();
        //input.nextLine();
        //String s = input.nextLine();
        input.close();
        double tip = (20*d)/100;
        double tax = (8*d)/100;
        System.out.println(d);
        System.out.println(tip);System.out.println(tax);
        double sum = (d+tip+tax);
        System.out.println(sum);
        Double data = new Double(sum);

        System.out.println(data.intValue());

    }
}
