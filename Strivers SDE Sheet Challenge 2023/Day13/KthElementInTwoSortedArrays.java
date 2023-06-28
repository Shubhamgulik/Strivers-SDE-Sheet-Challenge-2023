public class Solution {
    public static int ninjaAndLadoos(int a[], int b[], int m, int n, int k) {
        // Write your code here.
        int count = 0;

        int i = 0;
        int j = 0;
        
        while(i<m && j<n){
            if(a[i]<=b[j]){
                i++;
                count++;
                if(count == k){
                    return a[i-1];
                }

            }else{
                j++;
                count++;
                if(count == k){
                    return b[j-1];
                }

            }
        }

        while(i<m){
            i++;
                count++;
                if(count == k){
                    return a[i-1];
                }
        }

        while(j<n){
            j++;
                count++;
                if(count == k){
                    return b[j-1];
                }
        }

        return -1;


    }
}
