package ___BOJ___JAVA._4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int index = 0;


        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        int  maxTemp = arr[0];
        int  minTemp = arr[0];

        for (int i = 0; i <n ; i++) {
            maxTemp = Math.max(arr[i],maxTemp);
            minTemp = Math.min(arr[i],minTemp);
        }

        System.out.printf("%d %d",minTemp,maxTemp);
    }
}

