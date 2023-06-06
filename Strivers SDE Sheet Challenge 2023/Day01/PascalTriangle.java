class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();

        for(int i=0; i<numRows; i++){
            List<Integer> subList = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                if(j == 0 || j == i) {
                    subList.add(1);
                    continue;
                }
                if(i > 1){
                    subList.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
                }
                
            }
            System.out.println(subList);
            result.add(subList);
        }

        return result;
    }
}