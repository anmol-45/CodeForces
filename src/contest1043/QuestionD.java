package contest1043;

import java.io.*;
import java.util.*;

public class QuestionD {
    public static void main(String[] args) throws IOException {
//        FastReader reader = new FastReader();
//        int testCases = reader.nextInt();
        StringBuilder output = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long result = calculateMinimumCost(n, k);
            output.append(result).append("\n");
        }

        System.out.print(output);
    }

    private static long calculateMinimumCost(long total, long limit) {
        // If total ≤ limit, answer is simply 3 * total
        if (total <= limit) {
            return 3L * total;
        }

        long remainingMoves = (total - limit + 1) / 2;
        long additionalCost = 0;
        long current = total;
        long mul = 1;

        for (int i = 0; i < 60 && remainingMoves > 0; i++) {
            if (current < 3) {
                current = 0;
                mul *= 3;
                continue;
            }
            long possibleMoves = current / 3;
            long usedMoves = Math.min(possibleMoves, remainingMoves);
            additionalCost += usedMoves * mul;

            remainingMoves -= usedMoves;
            current = usedMoves;
            mul *= 3;
        }

        if (remainingMoves > 0) {
            return -1;
        } else {
            return 3L * total + additionalCost;
        }
    }


//    //input class
//    static class FastReader {
//        BufferedReader br;
//        StringTokenizer st;
//
//        FastReader() {
//            br = new BufferedReader(new InputStreamReader(System.in));
//        }
//
//        String next() throws IOException {
//            while (st == null || !st.hasMoreTokens()) {
//                st = new StringTokenizer(br.readLine());
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() throws IOException {
//            return Integer.parseInt(next());
//        }
//
//        long nextLong() throws IOException {
//            return Long.parseLong(next());
//        }
//    }
}
