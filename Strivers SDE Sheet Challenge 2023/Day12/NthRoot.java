public class Solution {
    public static int NthRoot(int n, int m) {

        // Write your code here.
        int low = 1;
        int high = m/2;

        while(low <= high){
            int mid = (low+high)/2;

            int power = (int)Math.pow(mid,n);

            if(power == m) return mid;
            else if(m > power){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return -1;

    }
}
