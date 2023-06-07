// Method 1

class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;

        int[] freq=new int[n+1];

        for(int i=0; i<n; i++){
            if(freq[arr[i]] == 0){
                freq[arr[i]] = 1;
            }else{
                return arr[i];
            }
        }

        return -1;

    }
}

// Method 2

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }
}
