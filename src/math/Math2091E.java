package math;


import java.util.*;

public class Math2091E {
    static Scanner sc  = new Scanner(System.in);
    static int n = (int)1e7;

    static boolean[] prime = new boolean[n+1];
    static List<Integer> arr = new ArrayList<>();

    static {

        Arrays.fill(prime , true);

        for(int i= 2;i<=n;i++){
            if(prime[i]){
                arr.add(i);
                for(int j= 2 ; i*j <=n;j++){
                        prime[i*j] = false;
                }
            }
        }

    }


    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int size = sc.nextInt();
            long ans = 0;

            for(int i=0;i<arr.size() && arr.get(i) <=size;i++){
                ans += size / arr.get(i);
            }
            System.out.println(ans);
        }
    }

}
