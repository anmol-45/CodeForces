package virtualContest.round81;

import java.util.*;
public class DifficultQuestion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.nextLine();

            int n = s.length();

            if(s.contains("FFT") || s.contains("NTT")){
                solve(s , n);
                System.out.println();
            }
            else{
                System.out.println(s);
            }
        }
    }
    private static void solve(String s , int n){
        StringBuilder ans = new StringBuilder();

        int cntF = 0;
        int cntN = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'F'){
                cntF++;
            }
            else if(s.charAt(i) == 'N')
                cntN++;
            else if(s.charAt(i) == 'T')
                System.out.print('T');
            else{
                ans.append(s.charAt(i));
            }
        }

        System.out.print(ans);
        for(int i=0;i<cntN;i++){
            System.out.print('N');
        }
        for(int i=0;i<cntF;i++){
            System.out.print('F');
        }
    }
}
