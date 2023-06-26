public class Solution {
    public static int search(int a[], int target) {
        // Write your code here.
        int n = a.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = (left + right)/2;

            if(a[mid] == target) return mid;

            if(a[left] <= a[mid]){
                // left part sorted
                if(a[left] <= target && target < a[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }

            }else{
                // right part sorted
                if(a[mid] < target && target <= a[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }

            }
        }

        return -1;
    }
}