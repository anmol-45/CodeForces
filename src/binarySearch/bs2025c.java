package binarySearch;


import java.util.*;


//C. New Game
public class bs2025c {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        sort the array based on the frequency and check how many element it can take
//                the number of taken element should be equal to k
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int ans = 0;

            //here I am using sliding window
            //to find the max window which satisfies the condition
            //where picking elements that are within limit of k
            for(int i=0;i<n;i++){
                int j = i;
                while(j+1<n && arr[j+1] - arr[j] <= 1 && arr[j+1] - arr[i] < k)
                    j++;
                ans = Math.max(ans , j-i+1);
            }
            System.out.println(ans);
        }

    }
}
