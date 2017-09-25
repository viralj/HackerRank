import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int fine = fine(d1, m1, y1, d2, m2, y2);

        System.out.println(fine);
    }

    public static int fine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y2 < y1) return 10000;
        if (y2 > y1) return 0;

        if (m2 < m1) return 500 * (m1 - m2);
        if (m2 > m1) return 0;

        if (d2 < d1) return 15 * (d1 - d2);
        return 0;
    }
}
