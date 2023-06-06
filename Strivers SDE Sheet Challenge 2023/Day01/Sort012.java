class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left=0,mid=0,right=n-1;

        while(mid<=right){
            if(nums[mid] == 0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                mid++;
                left++;
            }else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }else{
                mid++;
            }
        }
    }
}