// Brute force Method : 
// TC - O(m X n )
// SC - O(m X n)
import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
		List<Integer> result=new ArrayList<>();

		for(ArrayList<Integer> list: matrix){
			for(int i: list){
				result.add(i);

			}
		}

		Collections.sort(result);

		int n = result.size();

		return result.get(n/2);
	}
}

// Optimised : 

import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
		int result = binarySearch(matrix,0,100000,matrix.size(),matrix.get(0).size());

		return result;

	}
	public static int binarySearch(ArrayList<ArrayList<Integer>> matrix,int left, int right, int m, int n){
		while(left <= right){
			int mid = left + (right-left)/2;

			int count = findLessThanEqualTo(matrix,mid);

			if(count <= (m*n)/2){
				left = mid+1;
			}else{
				right = mid-1;
			}
		}

		return left;
	}
	public static int findLessThanEqualTo(ArrayList<ArrayList<Integer>> matrix,int target){
		int count = 0;
		for(int i=0; i<matrix.size(); i++){
			int left = 0;
			int right = matrix.get(i).size()-1;

			while(left <= right){
				int mid = left + (right-left)/2;


				if(target >= matrix.get(i).get(mid)){
					left = mid+1;
				}else{
					right = mid-1;
				}
			}

			count += left;
		}
		return count;
	}


}
