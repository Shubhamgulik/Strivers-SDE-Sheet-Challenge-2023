class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxi = 0;
        String str=""; 
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if( j-i+1 > maxi && isPalindrome(s,i,j)){
                    
                        maxi = Math.max(maxi,j-i+1);
                        str = s.substring(i,j+1);  
                    
                }
            }
        }
        return str;
    }

    boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i++) != s.charAt(j--) ) return false;
        }

        return true;
    }
}