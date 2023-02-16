package ___BOJ___JAVA._1_입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int b1 = b;

        int temp = (b % 10);
        b = (b/10);
        System.out.println(a*temp);

        temp = (b % 10);
        b = (b/10);
        System.out.println(a*temp);

        temp = (b % 10);
        b = (b / 10);
        System.out.println(a*temp);


        System.out.println((a* b1));
    }
}
