// Brute force : -
// TC- O(n+m)
// SC- O(n+m)

public class Solution {
    public static double median(int[] a, int[] b) {
    	// Write your code here.
        int m = a.length;
        int n = b.length;
        int ans[] =new int[m+n];

        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0)
        {
            if(a[i] >= b[j]){
                ans[k--] = a[i--];
            }else{
                ans[k--] = b[j--];
            }
        }
        

        
        while(i>=0)
            ans[k--] = a[i--];
        while(j>=0)
            ans[k--] = b[j--];
        
        int len = m+n;
        
        if(len % 2 != 0){
            return (double)ans[len/2];
        }else{
            return (double)((double)ans[(len-1)/2] + (double)ans[len/2])/2;
        }
    }
}
