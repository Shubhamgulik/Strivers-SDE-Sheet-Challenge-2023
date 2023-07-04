class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";
        String temp = "";


        int left = 0;

        while(left < n){
            char ch = s.charAt(left);
            
            if(ch != ' '){
                temp += ch;
            }else if((ch == ' ' && !temp.equals("")) ){
                // If ans contains something then add  temp to answer
                if(!ans.equals("")){
                    ans = temp + " " + ans;
                }else{
                    // answer is empty then add temp to ans;
                   ans = temp;
                }
                temp = "";
            }

            left++;
        }

        if(!temp.equals("")){
           // If answer contains something
           if(!ans.equals("")){
               ans = temp + " " + ans;
           }else{
            // answer is empty then add temp to ans;
               ans = temp;
           }
        }

        return ans;

        
    }

    
}
