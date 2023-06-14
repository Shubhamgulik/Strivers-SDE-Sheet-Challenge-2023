class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            
        if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
            int low = i+1;
            int high = n-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);

                    result.add(list);

                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1] )  high--;
                    low++;
                    high--;
                }else if(sum > 0) {high--;}
                else {low++;}
            }
        }

        }

        return result;

    }
}
