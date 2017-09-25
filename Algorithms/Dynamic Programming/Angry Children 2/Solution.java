import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(A);

        long[] pre = new long[N];
        long[] suf = new long[N];

        long temp = 0;
        for (int i = 0; i + K - 1 < N; i++) {
            if (i == 0) {
                for (int j = 1; j < K; j++) {
                    temp += A[j] - A[i];
                }
                pre[0] = temp;
                continue;
            }
            pre[i] = temp - (A[i] - A[i - 1]) * (K - 1) + A[i + K - 1] - A[i];
            temp = pre[i];
        }

        temp = 0;
        for (int i = N - 1; i >= K - 1; i--) {
            if (i == N - 1) {
                for (int j = N - 2; j >= N - K; j--) {
                    temp += A[i] - A[j];
                }
                suf[K - 1] = temp;
                continue;
            }
            suf[i] = temp - (A[i + 1] - A[i]) * (K - 1) + A[i] - A[i - K + 1];
            temp = suf[i];
        }

        long minUnfair = Long.MAX_VALUE;
        long lastUnfair = 0;
        for (int i = 0; i + K - 1 < N; i++) {
            if (i == 0) {
                long sum = 0;
                long up = pre[0];
                sum += up;
                for (int j = 1; j < K - 1; j++) {
                    up -= (A[j] - A[j - 1]) * (K - j);
                    sum += up;
                }
                long down = suf[K - 1];
                sum += down;
                for (int j = K - 2; j > 0; j--) {
                    down -= (A[j + 1] - A[j]) * (j + 1);
                    sum += down;
                }
                lastUnfair = sum / 2;
                minUnfair = lastUnfair;
                continue;
            }
            long unfair = lastUnfair - pre[i - 1] + suf[i + K - 1];
            minUnfair = Math.min(unfair, minUnfair);
            lastUnfair = unfair;
        }

        System.out.println(minUnfair);
    }
}
