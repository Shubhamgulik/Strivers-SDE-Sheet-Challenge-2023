import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        Arrays.sort(jobs,(a,b)->b[1]-a[1]);
        
        int deadline = 0;

        for(int i=0; i<jobs.length; i++){
            deadline = Math.max(deadline, jobs[i][0]);
        }
        int[] checkArray = new int[deadline+1];

        Arrays.fill(checkArray,-1);

        int profit = 0;

        for(int i=0; i<jobs.length; i++){
            int currDeadline = jobs[i][0];
            
            for(int j=currDeadline; j>0; j--){
                
                if(checkArray[j] == -1){
                    checkArray[j] = i;
                    profit += jobs[i][1];
                    break;
                }
            }
            
        }

        return profit;

    }
}
