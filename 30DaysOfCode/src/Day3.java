import java.util.Scanner;

public class Day3 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num>2&& !((num%2) ==0))System.out.println("Weird");
        else if (num>1&&num<6)System.out.println("Not Weird");
        else if (num>5&&num<21)System.out.println("Weird");
        else System.out.println("Not Weird");
    }
}
