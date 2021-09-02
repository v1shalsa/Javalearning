import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day11 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        arr.stream().forEach(i->{i.stream().forEach(System.out::print);System.out.println();});

        int[][] collection = new int[6][6];
        for(int i = 0;i<6;i++){
            List<Integer> temp = arr.get(i);
            for(int j=0;j<temp.size();j++){
                collection[i][j] = temp.get(j).intValue();
            }
        }

        for(int i = 0;i<6;i++){
            for(int j= 0;j<6;j++){
                System.out.print(collection[i][j]);
            }
            System.out.println();
        }

        int count = Integer.MIN_VALUE;
        for (int i = 0; i < collection.length - 1; i++) {
            for (int j = 0; j < collection.length; j++) {

                if (i >= collection.length - 2 || j >= collection.length - 2) {

                } else {
                    int temp = 0;
                    int firstTemp = collection[i][j] + collection[i][j + 1] + collection[i][j + 2];
                    int secoundTemp = collection[i + 1][j + 1];
                    int thirdTemp = collection[i + 2][j] + collection[i + 2][j + 1] + collection[i + 2][j + 2];

                    temp = firstTemp + secoundTemp + thirdTemp;

                    if (temp > count) {
                        count = temp;

                    }
                }

            }
        }
        System.out.println(count);

    }

}
