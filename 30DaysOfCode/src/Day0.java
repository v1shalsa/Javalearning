import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class Day0 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        List<Integer> sample = new ArrayList<>();
        AtomicReference<Integer> sum = new AtomicReference<>(0);
        sample.stream().forEach(i-> sum.updateAndGet(v -> v + i));
        sum.get().intValue();

        long pos = sample.stream().filter(i->i>0).count();

        List<Long> longsample = new ArrayList<>();
        AtomicLong lsum = new AtomicLong(0);
        longsample.stream().forEach(i->lsum.updateAndGet(v->v+i));
        lsum.longValue();
        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
    }
}
