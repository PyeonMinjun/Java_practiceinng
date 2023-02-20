package ___BOJ___JAVA._4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _3052_나머지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        HashSet<Integer> set = new HashSet<Integer>();
        int cnt = 1;

        for (int i = 0; i < 10; i++) {
            arr[i] = (Integer.parseInt(br.readLine()) % 42);
            set.add(arr[i]);
        }

        System.out.println((set.size()));

    }

}


