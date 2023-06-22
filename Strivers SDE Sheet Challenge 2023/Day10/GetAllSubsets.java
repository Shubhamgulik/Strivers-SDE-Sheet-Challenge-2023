// Method 1:

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        findSubset(nums,0,list,answer);

        return answer;

    }

    public static void findSubset(int[] num, int i, List<Integer> list, List<List<Integer>> answer){
        if(i == num.length){
            answer.add(new ArrayList<>(list));
            return;
        }

        list.add(num[i]);
        findSubset(num,i+1,list,answer);
        
        list.remove(list.size()-1);
        findSubset(num,i+1,list,answer);

        return;
    }
}

// Method 2:
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        findSubset(nums,0,list,answer);

        return answer;

    }

    public static void findSubset(int[] num, int i, List<Integer> list, List<List<Integer>> answer){
            answer.add(new ArrayList<>(list));
        
        for(int j=i; j<num.length; j++){
            list.add(num[j]);
            findSubset(num,j+1,list,answer);
            
            list.remove(list.size()-1);
        }
        return;
    }
}