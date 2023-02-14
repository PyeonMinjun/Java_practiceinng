package ___BOJ___JAVA._1_입출력과사칙연산;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import  java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ_1000_AB {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 고정
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p[] = new int[2];

        for (int i = 0; i < 2; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(p[0]+ p[1]);


    }
}
