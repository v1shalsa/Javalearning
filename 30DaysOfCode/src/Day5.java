import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Day5 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[]collect = IntStream.rangeClosed(1,10).map(i->i*n).toArray();
        int j=1;
        for(int i=0;i<collect.length;i++)
        {
            System.out.println(String.format("%d x %d = %d",n,j++,collect[i]));
        }

        bufferedReader.close();
    }
}
