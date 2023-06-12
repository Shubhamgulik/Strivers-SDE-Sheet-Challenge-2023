import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer,Integer> map=new HashMap<>();
		int longest = 0;
		int sum = 0;
		for(int i=0; i<arr.size(); i++){
			sum += arr.get(i);
			if(sum == 0){
				longest = i+1;
			}else if(map.containsKey(sum)){
				longest = Math.max(longest,i-map.get(sum));
			}else{
				map.put(sum,i);
			}
		}

		return longest;

	}
}