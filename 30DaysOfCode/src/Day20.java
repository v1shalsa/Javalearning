import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day20 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        // Write your code here
       long[] arr = a.stream().mapToLong(i->i.longValue()).toArray();
       int tswap = 0;
       for(int i =0;i<n;i++){
           int swaps = 0;
           for(int j=0;j<n-1;j++) {
               if (arr[j] > arr[j + 1]) {
                   long temp = arr[j + 1];
                   arr[j + 1] = arr[j];
                   arr[j] = temp;
                   swaps++;
                   tswap++;
               }
               //if (swaps == 0) break;
           }
       }

        System.out.println(String.format("Array is sorted in %d swaps",tswap));
        System.out.println(String.format("First Element: %d",arr[0]));
        System.out.println(String.format("Last Element: %d",arr[arr.length-1]));

        bufferedReader.close();
    }
}

/*
 List<AtomicInteger> b = new ArrayList<>();
        HashMap<Integer,Integer> kv = new HashMap<>();
        a.stream().forEach(i-> kv.put(i,i.intValue()));

        IntStream.range(0,n).forEach(i ->{
            AtomicInteger swap = new AtomicInteger(0);
            IntStream.range(0,n-1).forEach(j->{
                if(a.get(j)>a.get(j+1)){
                    kv.put(j,a.get(j+1));
                    kv.put(j+1,a.get(j));
                    swap.getAndIncrement();
                    b.add(swap);
                }
            });
            if(swap.get()==0 && i==0)i=n;
        });
 */