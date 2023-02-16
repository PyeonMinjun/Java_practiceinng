package ___BOJ___JAVA._1_입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003_킹퀸룩비숍나이트폰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        a = 1 - a;
        b = 1 - b;
        c = 2 - c;
        d = 2 - d;
        e = 2 - e;
        f = 8 - f;

        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        System.out.print(d+" ");
        System.out.print(e+" ");
        System.out.print(f);


    }
}
