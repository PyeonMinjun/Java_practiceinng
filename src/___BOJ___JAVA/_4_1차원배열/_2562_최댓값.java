package ___BOJ___JAVA._4_1차원배열;

import java.io.*;

public class _2562_최댓값 {
    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[] arr = new int[9];
            for (int i = 0; i < 9; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            int maxArr = arr[0];
            int res = 0;
            for (int i = 0; i < 9; i++) {
                if (maxArr < arr[i]) {
                    maxArr = Math.max(maxArr, arr[i]);
                    res = i;
                }

            }
            System.out.println(maxArr);
            System.out.println(res+1);
        }
    }

