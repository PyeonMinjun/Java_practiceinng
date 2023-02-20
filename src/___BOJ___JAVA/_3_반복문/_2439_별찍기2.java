package ___BOJ___JAVA._3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class _2439_별찍기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int j = 1; j < n+1; j++) {
           for (int i = 0; i < n-j; i++) {
               System.out.print(" ");
            }
            for (int k = 0; k < j ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

