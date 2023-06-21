import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
			// List<List<Double>> list=new ArrayList<List<Double>>();

			Arrays.sort(items,(a,b)->b.value*a.weight - a.value*b.weight);

			double ans = 0;

			for(int i=0; i<n; i++){
				if(items[i].weight <= w){
					ans += items[i].value;
					w -= items[i].weight;
				}else{
					ans += (double)items[i].value*w/(double)items[i].weight;					w = 0;
					break;
				}
			}

			return ans;


    }
}
