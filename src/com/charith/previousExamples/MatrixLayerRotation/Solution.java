package com.charith.previousExamples.MatrixLayerRotation;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the matrixRotation function below.
    private static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        boolean continueIteration = true;
        int currentIteration = 0;
        List<List<Integer>> newMatrix = new ArrayList<>(new ArrayList<>());
        r = r % ((m + n) * 2);//guarantee r is with in the boundary limits
        do {
            for (int i = n - currentIteration - 1; i >= currentIteration; i--) {
                System.out.println(matrix.get(currentIteration).get(i));
                int shiftedLocation = 0;
                if(i-r>=0){
                    //newMatrix.
                } else{

                }
            }
            for (int i = currentIteration + 1; i < m - currentIteration - 1; i++) {
                System.out.println(matrix.get(i).get(currentIteration));
            }
            for (int i = currentIteration; i < n - currentIteration; i++) {
                System.out.println(matrix.get(m - currentIteration - 1).get(i));
            }
            for (int i = m - currentIteration - 2; i > currentIteration; i--) {
                System.out.println(matrix.get(i).get(n - currentIteration - 1));
            }
            System.out.println("completed iteration");
            currentIteration++;

            if ((m / 2 - currentIteration) == 0 || (n / 2 - currentIteration) == 0) {
                continueIteration = false;
            }
        } while (continueIteration);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(mnr[0]);

        int n = Integer.parseInt(mnr[1]);

        int r = Integer.parseInt(mnr[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
