package ___BOJ___JAVA._4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt((st.nextToken()));
        }

        double maxArr = 0;
        for (int i = 0; i < n; i++) {
            maxArr = Math.max(maxArr, arr[i]);
        }

        double nsum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = ((arr[i]) *100 / maxArr);
//            System.out.println(arr[i]);
            nsum += arr[i];
        }

        double navg = nsum / n;
        System.out.println(navg);


    }
}
