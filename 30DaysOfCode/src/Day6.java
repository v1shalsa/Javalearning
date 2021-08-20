import java.util.Scanner;

public class Day6 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int nos = input.nextInt();

        for(int j =0;j<nos;j++){
            String line = input.next();

            char[] charline = line.toCharArray();

            for(int i = 0;i<charline.length;i+=2){
                System.out.print(charline[i]);
            }
            System.out.print(" ");
            for(int i = 1;i<charline.length;i+=2){
                System.out.print(charline[i]);
            }
            System.out.println();
        }
        input.close();

    }
}
