package ___BOJ___JAVA._3_반복문;

import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class _15552_빠른ab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <n ; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            bw.write(a+b+"\n");

        }
//        bw.flush();

    }
}
