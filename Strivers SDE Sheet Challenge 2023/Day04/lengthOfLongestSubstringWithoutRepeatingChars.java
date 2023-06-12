// Brute force

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(s == null || s.isEmpty()) return 0;
        int len = 1;

        for(int i=0; i<n; i++){
            Set<Character> set=new HashSet<>();
            set.add(s.charAt(i));
            int curr = 1;
            for(int j=i+1; j<n; j++ ){
                if(!set.contains(s.charAt(j))){
                    curr++;
                    set.add(s.charAt(j));
                    len = Math.max(len,curr);
                }else{
                    curr = 0;
                    set=new HashSet<>();
                }
            }
        }
        return len;
    }
}

// Optimal approach :

class Solution {
    public int lengthOfLongestSubstring(String str) {
        if(str.length()==0)
             return 0;
        int maxans = Integer.MIN_VALUE;
        Set < Character > set = new HashSet < > ();
        int l = 0;
        for (int r = 0; r < str.length(); r++) // outer loop for traversing the string
        {
            if (set.contains(str.charAt(r))) //if duplicate element is found
            {
                while (l < r && set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            maxans = Math.max(maxans, set.size());
        }
        return maxans;
    }
}