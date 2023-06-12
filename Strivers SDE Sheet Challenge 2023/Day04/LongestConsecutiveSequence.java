class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }

        HashSet<Integer> set=new HashSet<>();

        for(int i: nums){
            set.add(i);
        }

        int longest = 0;

        for(int i: nums){
            if(!set.contains(i-1)){
                int curr = 1;
                int elem = i;

                while(set.contains(elem+1)){
                    curr++;
                    elem++;
                }
                longest = Math.max(longest,curr);
            }
        }
        return longest;
    }
}