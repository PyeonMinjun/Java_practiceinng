package ___BOJ___JAVA._2_조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2480_주사위세개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());



        int[] arr = new int[10];

        for (int i = 0; i < 3; i++) {
            int o = Integer.parseInt(st.nextToken());
            arr[o] += 1;
        }
        boolean chk = false;

        for (int i = 0; i <= 6; i++) {
            if (arr[i] == 3){
                chk = true;
                System.out.println((i)*1000 + 10000);
                break;

            } else if (arr[i] == 2) {
                chk = true;
                System.out.println((i)*100 + 1000);
                break;
            }
        }
        int p = 0;
        if (chk == false) {
            for (int i = 6; i >= 0 ; i--) {  // 5 > 0
                if (arr[i] == 1){
                    p = i;
                    break;
                }
            }
            System.out.println(p *100 );
        }

    }
}
