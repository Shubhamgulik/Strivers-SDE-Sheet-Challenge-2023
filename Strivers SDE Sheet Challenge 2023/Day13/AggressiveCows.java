import java.util.* ;
import java.io.*; 
public class Solution {

    public static int chessTournament(int[] a, int n,  int cows) 
	{
        // Write your code here.  
        Arrays.sort(a);

        int low = 1;
        int high = a[n-1]-a[0];
        while(low <= high){
            int mid = (high+low)/2;

            if(isCompatible(a,mid,cows)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return high;

    }
    public static boolean isCompatible(int[] a,int distance, int cows){
        int k = a[0];
        int count = 1;
        for(int i=1; i<a.length; i++){
            if(a[i]-k >= distance){
                count++;
                k = a[i];
            }
        }

        if(count >= cows) return true;
        // return false;

        return false;
    }

}
