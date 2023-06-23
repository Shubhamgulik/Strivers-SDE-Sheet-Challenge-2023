class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] check=new boolean[nums.length];

        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();

        return findAll(nums,check,result,list);
    }
    public List<List<Integer>> findAll(int[] nums,boolean[] check,List<List<Integer>> result,List<Integer> list){
            if(list.size() == nums.length){
                result.add(new ArrayList<Integer>(list));
                return result;
            }

            for(int i=0; i<nums.length; i++){
                if(check[i] == false){
                    check[i] = true;
                    list.add(nums[i]);
                    findAll(nums,check,result,list);
                    list.remove(list.size()-1);
                    check[i] = false;
                }
            }

            return result;

        }
}
