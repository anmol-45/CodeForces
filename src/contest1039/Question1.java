package contest1039;

import java.util.*;
public class Question1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();

            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                int ele =  sc.nextInt();
                arr.add(ele);
            }
            Collections.sort(arr);

            int ans = 0;
            int cnt = 0;

            while(arr.size() > 0){
                long checker = 0;
                if(cnt < 63){
                    checker = c >> cnt;
                }

                int idx = lowerBound(arr , checker);
                if(idx > 0){
                    arr.remove(idx-1);
                }
                else{
                    ans++;
                    arr.remove(arr.size()-1);
                }
                cnt++;
            }
            System.out.println(ans);
        }
    }
    public static int lowerBound(List<Integer> arr, long target) {
        int left = 0, right = arr.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
