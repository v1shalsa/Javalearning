import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        try{
            int val = Integer.parseInt(S);
            System.out.println(val);
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
