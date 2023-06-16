// Brute Force Method: 
class Solution {
    public int trap(int[] a) {
        int n = a.length;
        int trapped = 0;

        for(int i=0; i<n; i++){
            int left = 0, right = 0;
            int j = i;

            while(j>=0){
                left =  Math.max(left,a[j--]);
            }

            j = i;
            while(j<n){
                right =  Math.max(right,a[j++]);
            }

            trapped += Math.min(left,right) - a[i];
        }

        return trapped;
    }
}

// Better Approach: 
class Solution {
    public int trap(int[] a) {
        int n = a.length;
        int trapped = 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        int maxi = 0;
        for(int i=0; i<n; i++){
            maxi = Math.max(maxi,a[i]);
            leftMax[i] = maxi;
        }
        
        maxi = 0;
        for(int i=n-1; i>0; i--){
            maxi = Math.max(maxi,a[i]);
            rightMax[i] = maxi;
        }

        for(int i=1; i<n; i++){
            trapped += Math.min(leftMax[i],rightMax[i]) - a[i];
        }


        return trapped;
    }
}

// Optimised Approach : 

class Solution {
    public int trap(int[] a) {
        int n = a.length;
        // int trapped = 0;

        int i = 0, j = n-1, leftMax = 0, rightMax = 0, trapped = 0;

        while(i < j){
            if(a[i] <= a[j]){
                if(a[i] > leftMax){
                    leftMax = a[i];
                }else{
                    trapped += leftMax - a[i];
                }
                i++;
            }else{
                if(a[j] > rightMax){
                    rightMax = a[j];
                }else{
                    trapped += rightMax - a[j];
                }
                j--;
            }
        }
        return trapped;
    }
}

