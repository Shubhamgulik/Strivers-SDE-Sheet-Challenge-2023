// Brute force approach:

public class Solution {
    public static int calculateMinPatforms(int arr[], int dep[], int n) {
        // Write your code here.
        int ans=1; //final value
    for(int i=0;i<=n-1;i++)
    {
        int count=1; // count of overlapping interval of only this   iteration
        for(int j=i+1;j<=n-1;j++)
        {
            if((arr[i]>=arr[j] && arr[i]<=dep[j]) ||
           (arr[j]>=arr[i] && arr[j]<=dep[i]))
           {
               count++;
           }
        }
        ans=Math.max(ans,count); //updating the value
    }
    return ans;

    }
}


// Optimised :

import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int arr[], int dep[], int n) {
        // Write your code here.
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platformsNeeded = 1;
        int result = 1;

        int i=0, j=1;

        while(i < n && j < n){

            if(arr[j] <= dep[i]){
                platformsNeeded++;
                j++;
            }else{
                platformsNeeded--;
                i++;
            }

            result = Math.max(result,platformsNeeded);

        }

        return result;

        

    }
}

