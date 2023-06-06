// Method1:

class Solution {
    public int maxProfit(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
                max = a[i];
            }else if(a[i] > max){
                max = a[i];
            }

            ans = Math.max(ans,max-min);
        }

        return ans;
    }
}

// Method 2:

class Solution {
    public int maxProfit(int[] a) {
        int profit = 0;
        int min = a[0];
       
        for(int i=1; i<a.length; i++){
            int temp = a[i] - min;
            profit = Math.max(profit,temp);
            min = Math.min(a[i],min);
        }

        return profit;
    }
}