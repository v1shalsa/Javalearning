import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,String> phdir = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            String phno = String.valueOf(phone);
            phdir.put(name,phno);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phdir.containsKey(s))System.out.println(s+"="+phdir.get(s));
            else System.out.println("Not found");
        }
        in.close();
    }
}
