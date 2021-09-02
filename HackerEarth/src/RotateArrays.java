import java.util.HashMap;

public class RotateArrays {

    public static void main(String[] args){
        int rotate = 2;
        int[] input = {1,2,3,4,5};


        for(int i =0;i<rotate;i++){
            int[] temp = new int[input.length];
            int first = input[input.length-1];
            for(int j =1;j<input.length;j++){
                temp[j] = input[j-1];
            }
            temp[0]=first;
            input=temp;
        }
        for(int i =0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }

}
