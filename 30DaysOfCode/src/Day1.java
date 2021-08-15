import java.util.Scanner;

public class Day1 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        double d = input.nextDouble();
        input.nextLine();
        String s = input.nextLine();
        input.close();
        System.out.println(
                String.format("int = %d, double = %1f, string = %s",i,d,s)
        );
    }
}
