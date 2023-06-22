class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        findSubset(nums,0,list,answer);

        return answer;
    }

    public static void findSubset(int[] num, int i, List<Integer> list, List<List<Integer>> answer){
            answer.add(new ArrayList<>(list));
        
        for(int j=i; j<num.length; j++){
            if(j > i && num[j] == num[j-1]) continue;
            list.add(num[j]);
            findSubset(num,j+1,list,answer);
            
            list.remove(list.size()-1);
        }

        return;
    }
}