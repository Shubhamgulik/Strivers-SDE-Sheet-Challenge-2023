import java.util.* ;
import java.io.*; 
public class Solution {
    public static long ayushGivesNinjatest(int n, int m, int[] a) {
        // Write your code here.
        long low = a[0];
        long high = 0;

        for(int i=0; i<m; i++){
            high += a[i];
            low = Math.min(low,a[i]);
        }
        long res = -1;
        while(low <= high){
            long mid = (high+low)/2;

            if(isPossible(a,m,n,mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return res;
    }

    public static boolean isPossible(int[] a,int m, int n, long target){
        long sum = 0;
        int count = 0;

        for(int i=0; i<m; i++){
            sum = sum + a[i];

            if(sum > target){
                sum = a[i];
                count++;
                if(sum > target) return false;
            }
            // else{
            //     sum = sum + a[i];
            // }
        }

        if(count < n){
            return true;
        }

        return false;
    }
}