class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word1 = strs[0];
        for(int i=1; i<strs.length; i++){
            word1 = prefix(word1,strs[i]);
        }
        return word1;
    }
    public String prefix(String a, String b){
        String res = "";
        int i= 0;

        while(i < a.length() && i<b.length()){
            if(a.charAt(i) == b.charAt(i)){
                res += a.charAt(i);
            }else{
                break;
            }
            i++;
        }

        return res;
    }
}