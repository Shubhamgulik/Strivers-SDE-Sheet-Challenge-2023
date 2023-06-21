import java.util.*;
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        List<List<Integer>> list=new ArrayList<List<Integer>>();

        for(int i=0; i<start.size(); i++){
            List<Integer> subList = Arrays.asList(start.get(i),end.get(i),i);
            list.add(subList);
        }

        Collections.sort(list,(a,b)->a.get(1)-b.get(1));

        int lastEndTime = list.get(0).get(1);
        int ans = 1;
        
        for(int i=1; i<start.size(); i++){
            int startTime = list.get(i).get(0);
            if(startTime >= lastEndTime){
                ans += 1;
                lastEndTime = list.get(i).get(1);
            }
        }

        return ans;


    }
}
