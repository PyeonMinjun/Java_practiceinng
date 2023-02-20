package ___BOJ___JAVA._3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class _1110_더하기사이클 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int copy = t;
        int cnt = 0;

        while (true){
           t = ((t % 10)* 10) + (((t % 10) + (t / 10)) % 10);
           cnt+= 1;

           if (copy == t){
               break;
           }
        }
        System.out.println(cnt);


    }
}
