import java.util.*;
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> nums, int n, int target) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list=new ArrayList<>();

        backTracking(nums,0,target,list,ans);

        return ans;
    }
    public static void backTracking(ArrayList<Integer> nums, int ind, int target, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){

        if(ind == nums.size()){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        // if(nums.get(ind) <= target){
            list.add(nums.get(ind));
            backTracking(nums,ind+1,target-nums.get(ind),list,ans);
            list.remove(list.size()-1);
        // }
        backTracking(nums,ind+1,target,list,ans);

    }
}