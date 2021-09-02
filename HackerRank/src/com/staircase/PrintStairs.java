package com.staircase;

public class PrintStairs {

    public static void main(String[] args){
        int n =6;
        //String [] prints = new String[6];
        for(int i=0;i<n;i++){
            int limit = n-i;
            StringBuilder st = new StringBuilder(0);
            for(int k=0;k<limit;k++){
                st.append(" ");
            }
            for(int j=0;j<=i;j++){
                st.append("#");
            }
            System.out.println(st.toString());
        }
    }

}
