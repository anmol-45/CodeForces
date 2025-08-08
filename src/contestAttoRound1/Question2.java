package contestAttoRound1;

import java.util.*;

public class Question2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                arr[i] = x;
            }
            solve(arr);
        }
    }
    private static void  solve(int[] arr){
        Set<Integer> st = new HashSet<>();
        for (int j : arr) {
            if (j != -1)
                st.add(j);
        }
        if(st.isEmpty()){
            System.out.println("YES");
        }
        else if(st.size()> 1){
            System.out.println("NO");
        }
        else{
            int k = st.iterator().next();
            if(k > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
