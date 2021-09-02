import java.util.Scanner;
import java.util.stream.IntStream;

public class Twosome {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= in.nextInt();
        }
        int target = in.nextInt();
        in.close();
        boolean flag = false;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((arr[i]+arr[j])==target)
                {
                    flag = true;
                    int[] out = {i,j};
                    System.out.println(out[0]+" "+out[1]);
                    break;
                }
            }
            if(flag)break;
        }
    }


}
