package ___BOJ___JAVA._2_조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14681_사분면고르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a > 0 && b > 0) System.out.println(1);
        else if (a < 0 && b > 0) System.out.println(2);
        else if (a < 0 && b < 0 ) System.out.println(3);
        else if (a > 0 && b < 0) System.out.println(4);

    }
}
