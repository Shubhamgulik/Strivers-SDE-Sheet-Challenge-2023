import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        // int n = arr.length;
        int duplicate = -1;
        int missing = -1;
        int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (freq[arr.get(i)] == 0) {
                freq[arr.get(i)] += 1;
            } else {
                duplicate = arr.get(i);
            }
        }
        for(int i=1; i<n+1; i++){
            if(freq[i] == 0){
                missing = i;
            }
        }
        int[] a={missing,duplicate};

        return a;
    }
}