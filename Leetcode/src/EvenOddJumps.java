import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOddJumps {

    public static void main(String[] args){
       // int[] arr = {10,13,12,14,15};
        int[] arr = {5,1,3,4,2};
        oddeven(arr,0,0);
        //System.out.println(output);
       // Solution sol = new Solution();
       // int ans = sol.oddEvenJumps(arr);
       // System.out.println(ans);
    }
    public static void oddeven(int[] arr, int start, int jumps){
        //int jumps = 0;
        //for(int i=start;i<arr.length;i++){
        boolean flag = false;
        if(start<arr.length-1){
            int[] rem = Arrays.copyOfRange(arr,start+1,arr.length);
            int oddjump = Arrays.stream(rem).min().getAsInt();

            if(arr[start]<=oddjump){
                int nextoddpos = start;
                for(int j=0;j<rem.length;j++){
                    if(rem[j]==oddjump){
                        if(j%2!=0){
                            jumps++;
                            nextoddpos =Arrays.binarySearch(arr,oddjump);
                            rem = Arrays.copyOfRange(rem,nextoddpos,rem.length);
                            flag = true;
                            break;
                        }
                    }
                }
                //if(flag){
                //    oddeven(rem,nextoddpos,jumps);
                //}
            }
            flag = false;
            int[] rem1 = Arrays.copyOfRange(arr,start+1,arr.length);
            int evenjump = Arrays.stream(rem1).max().getAsInt();
            if(arr[start]>=evenjump){
                int nextevenpos = start;
                for(int j=0;j<rem1.length;j++){
                    if(rem1[j]==evenjump){
                        if(j%2==0){
                            jumps++;
                            nextevenpos=Arrays.binarySearch(arr,evenjump);
                            rem1 = Arrays.copyOfRange(rem1,nextevenpos,rem1.length);
                            flag = true;
                            break;
                        }
                    }
                }
                //if(flag){
                //    oddeven(rem1,nextevenpos,jumps);
                //}
            }
        }
        System.out.println(jumps);
    }

}
