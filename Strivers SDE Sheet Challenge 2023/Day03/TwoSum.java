class Solution {
    public int[] twoSum(int[] a, int target) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        map.put(a[0],0);

        for(int i=1; i<a.length; i++){
            int rem = target-a[i];

            if(map.containsKey(rem)){
                res[0] = map.get(rem);
                res[1] = i;
                break;
            }else{
                map.put(a[i],i);
            }
        }
        return res;
    }
}