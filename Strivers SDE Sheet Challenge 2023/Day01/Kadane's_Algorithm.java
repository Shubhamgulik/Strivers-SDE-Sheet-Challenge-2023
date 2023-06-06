// Method 1:
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = 0;
                for(int k=i; k<=j; k++){
                    temp += nums[k];
                }
                if(temp > sum) sum = temp;
            }
        }
        return sum;
    }
}

// Method 2:
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int maxi = nums[0];
        int sum = 0;

        for(int i=0; i<n; i++){

            sum += nums[i];
            maxi = Math.max(sum,maxi);
            if(sum < 0) sum = 0;
            
        }
        return maxi;
    }
}