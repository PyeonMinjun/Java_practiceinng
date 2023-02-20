package ___BOJ___JAVA._4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4344_평균은넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            double arrsum = 0;
            int[] arr = new int[f];

            for (int j = 0; j < f; j++) {

                arr[j] = (Integer.parseInt(st.nextToken()));
                arrsum += arr[j];
            }

            double avg = arrsum / f;
            double cnt = 0;

            for (int k = 0; k < f; k++) {
                if (avg < arr[k]){
                    cnt += 1;
                }
            }
            System.out.println((cnt /f)*100);
        }


    }
}
