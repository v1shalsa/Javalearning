public class Day29 {

    public static void main(String[] args){
        int nos = 5;
        int k =2;
        int min =0;
        for(int i=1;i<nos;i++){
            for(int j=i+1;j<=nos;j++){
                //int temp = i&j;
                //if(temp<k && temp>=min)min=temp;
                System.out.println(i+" "+j);
            }
        }
        //System.out.println(min);
    }
}
