package ___BOJ___JAVA._3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25314_코딩은체육과목입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        n = n / 4;

        for (int i = 0; i <n; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
