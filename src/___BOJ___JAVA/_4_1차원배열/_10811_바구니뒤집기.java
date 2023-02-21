package ___BOJ___JAVA._4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10811_바구니뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken())-1;
            int b = Integer.parseInt(st1.nextToken())-1;
            int temp;
            while(a<b){
                temp = arr[a];
                arr[a++] = arr[b];
                arr[b--] = temp;

            }
            }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }

    }




}

