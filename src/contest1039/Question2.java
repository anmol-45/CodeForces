package contest1039;

import java.util.*;
import java.util.Scanner;

public class Question2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for(int i=0;i<n;i++){
                int ele = sc.nextInt();
                arr.add(ele);
            }

            solve(arr , n);
        }
    }

    private static void solve(List<Integer> arr , int n){
        Deque<Integer> dq = new ArrayDeque<>();

        int left = 0;
        int right = n-1;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){

            char cnt;
            boolean leftPossible = isPossible(arr.get(left) , dq);
            boolean rightPossible = isPossible(arr.get(right) , dq);

             if(leftPossible && !rightPossible){
                cnt  = 'L';
            }
            else if(!leftPossible && rightPossible){
                cnt = 'R';
            }
            else if(leftPossible && rightPossible){
                cnt = findPossible( left, right, arr, dq);
            }
            else{
                 cnt = 'L';
             }

            if(cnt == 'L'){
                if(dq.size() == 4 )
                    dq.pollFirst();
                dq.addLast(arr.get(left));
                sb.append(cnt);
                left++;
            }
            else{
                if(dq.size() == 4 )
                    dq.pollFirst();
                dq.addLast(arr.get(right));
                sb.append(cnt);
                right--;
            }
        }
        System.out.println(sb);
    }
    private static char findPossible( int leftIdx, int rightIdx, List<Integer> positions, Deque<Integer> recentMoves){

            // Simulate choosing Left
            Deque<Integer> leftSim = new ArrayDeque<>(recentMoves);
            if (leftSim.size() == 4) leftSim.pollFirst();
            leftSim.addLast(positions.get(leftIdx));

            boolean isFutureLeftSafe = false;
            if (leftIdx + 1 <= rightIdx) {
                if (isPossible( positions.get(leftIdx + 1), leftSim) || isPossible( positions.get(rightIdx) , leftSim)) {
                    isFutureLeftSafe = true;
                }
            } else {
                isFutureLeftSafe = true;
            }

            // Simulate choosing Right
            Deque<Integer> rightSim = new ArrayDeque<>(recentMoves);
            if (rightSim.size() == 4) rightSim.pollFirst();
            rightSim.addLast(positions.get(rightIdx));

            boolean isFutureRightSafe = false;
            if (leftIdx <=rightIdx - 1) {
                if (isPossible( positions.get(leftIdx), rightSim) || isPossible(positions.get(rightIdx - 1), rightSim)) {
                    isFutureRightSafe = true;
                }
            } else {
                isFutureRightSafe = true;
            }


        if (isFutureLeftSafe && !isFutureRightSafe) {
            return 'L';
        } else if (isFutureRightSafe && !isFutureLeftSafe) {
            return 'R';
        } else {
            return 'L'; // tie breaker
        }
    }

    private static boolean isPossible(int ele,Deque<Integer> dq){
        if(dq.size() < 4)
            return true;
        List<Integer> snapshot = new ArrayList<>(dq);
        int a = snapshot.get(0);
        int b = snapshot.get(1);
        int c = snapshot.get(2);
        int d = snapshot.get(3);

        // strictly increasing a<b<c<d<ele  ⇒ unsafe
        if (a < b && b < c && c < d && d < ele) {
            return false;
        }
        if (a > b && b > c && c > d && d > ele) {
            return false;
        }

        // otherwise safe
        return true;
    }
}
