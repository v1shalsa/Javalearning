import java.util.Scanner;
import java.util.stream.Stream;

public class Day10 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int binary = input.nextInt();
        System.out.println(Integer.toBinaryString(binary));

        char[] binNos = Integer.toBinaryString(binary).toCharArray();
        int maxseq = 0;
        int reset = 0;
        for(int i=0;i<binNos.length;i++){
            if(binNos[i] == '0')
            {
                if(reset>maxseq)maxseq=reset;
                reset = 0;

            }else{
                reset++;
            }
        }
        System.out.println(maxseq);

        //String[] groupings = Integer.toBinaryString(n).split("0");
        //int max = 0;
        //for(String s : groupings){
        //    if(max < s.length()){
        //        max = s.length();
        //    }
        //}
        //System.out.println(max);
    }
}
