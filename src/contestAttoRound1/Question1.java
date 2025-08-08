package contestAttoRound1;

import java.util.Scanner;

public class Question1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            String s = sc.next();


            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(ch == '.')
                    arr[i] = 0;
                else{
                    arr[i] = 1;
                }
            }

            //putting 1 on left side and finding answer
            int d1 = 0;
            if(x != 0){
                arr[x-1] = 1;
                d1 = solve(arr , x);
            }

            int d2 = 0;

            if(x+1 <arr.length){
                arr[x+1] = 1;
                d2 = solve(arr , x);
            }
            System.out.println(Math.max(d1 , d2));
        }
    }

    private static int solve(int[] arr , int x){
        if(x == 0 || x == arr.length-1)
            return 1;

        //put one on left side and calc the distance of left and right and return the min

        //calculate both left and right
        //calculating left
        int ans = 0;

        int i = x-1;
        while(i>=0 && arr[i] == 0){
            i--;
        }
        ans = i+2;

        //calculating right
        i = x+1;
        while(i<arr.length && arr[i]== 0)   i++;
        ans = Math.min(ans , arr.length - i + 1);

        return ans;
    }
}
