// Brute force : 

I. 3 For loops : O(n^3);
II. 2 For Loops : O(n^2);

// Optimised : O(n);

class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int maxi = 0;
        int n = a.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(a[i] == 1){
                count++;
                maxi=Math.max(count,maxi);
            }else{
                count = 0;
            }
        }
        return maxi;
    }
}


/// Variation of Problem : Longest Consecutive sequence of 1's with replacing atmost K zeroes(0's) with Ones (1's);

// Brute Force : 3 For loops, 2 For Loops 

class Solution {
    public int longestOnes(int[] a, int k) {
        int maxi = 0;

        int n = a.length;

        for(int i=0; i<n; i++){
            
            int longestSequence = 0;
            int countZeroes = 0;

            for(int j=i; j<n; j++){
                    if(a[j] == 1){
                        longestSequence++;
                    }else if(countZeroes < k && a[j] == 0){
                        longestSequence++;
                        countZeroes++;
                    }else{
                        longestSequence = 0;
                        countZeroes = 0;
                    }
                
                maxi = Math.max(maxi,longestSequence);
            }
        }

        return maxi;
    }
}

// Optimised Approach : O(n);

class Solution {
    public int longestOnes(int[] a, int k) {
        int maxi = 0;
        int n = a.length;

        int left = 0;
        int right =0;
        int zeroCount = 0;

        while(right < n){
            if(a[right] == 0) zeroCount++;

            if(zeroCount > k){
                if(a[left] == 0) zeroCount--;
                left++;
            }

            maxi = Math.max(maxi,right-left+1);
            right++;
        }
        
        return maxi;
    }
}
