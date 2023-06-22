class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();

        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        backTracking(nums,0,target,list,ans);

        return ans;
    }

    public static void backTracking(int[] nums, int ind, int target, List<Integer> list, List<List<Integer>> ans){

        // if(ind == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            // return;
        // }

        for(int i = ind; i<nums.length; i++){
            if(i > ind && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;
            //  if(nums[i] <= target){
                list.add(nums[i]);
                backTracking(nums,i+1,target-nums[i],list,ans);
                list.remove(list.size()-1);
            // }
            // backTracking(nums,ind+1,target,list,ans);
        }

    }
}
