class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // Find Break Point
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        // If break point not exist
        if(ind == -1){
            reverse(nums,0,n-1);
            return;
        }

        // If BreakPoint Exists

        // 1. Find greater Element and swap
        for(int i=n-1; i>ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        // 2. Now reverse the right half of array
        reverse(nums,ind+1,n-1);
    }


    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i, int j){
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    
}