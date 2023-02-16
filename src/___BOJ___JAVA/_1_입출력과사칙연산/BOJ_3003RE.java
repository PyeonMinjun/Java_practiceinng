package ___BOJ___JAVA._1_입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003RE {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[]{1,1,2,2,2,8};

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++){
            System.out.print((arr[i] - Integer.parseInt(st.nextToken()))+" ");

        }

    }
}
