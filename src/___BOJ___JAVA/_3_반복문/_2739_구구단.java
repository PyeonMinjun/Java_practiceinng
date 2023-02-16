package ___BOJ___JAVA._3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2739_구구단 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n,i,n*i);
        }
    }
}
