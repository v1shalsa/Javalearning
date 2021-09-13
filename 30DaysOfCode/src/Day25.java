import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Day25 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int nos = in.nextInt();
        boolean[]store = new boolean[nos];

        Predicate<Integer> isprime = new Predicate<Integer>() {
            @Override
            public boolean test(Integer o) {
                if(o.equals(1))return false;
                for(int i=2;i<o;i++){
                    if(o%i==0){
                        return false;
                    }
                }
                return true;
            }
        };
        for(int i=0;i<nos;i++){
            int primeno = in.nextInt();
            store[i] = isprime.test(primeno);
        }
        for(int i=0;i<store.length;i++){
            if(store[i])System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
}
