package contest1043;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());

            int[] cost = new int[21];
            int[] power = new int[21];


            computePowAndCost(19, cost, power);
//            List<Long> ans = new ArrayList<>();

            long ans = 0;
            int x = 0;
            while (n > 0) {
                long rem = n % 3;
                ans +=  rem * cost[x];
                n /= 3;
                x++;
            }
            System.out.println(ans);
        }
    }

    private static void computePowAndCost(int n , int[] cost , int[] power) {
        power[0] = 1;
        for (int i = 1; i <= n; ++i) power[i] = power[i - 1] * 3;
        cost[0] = 3;
        for (int k = 1; k <= n; ++k) cost[k] = power[k + 1] + k * power[k - 1];
    }
}
