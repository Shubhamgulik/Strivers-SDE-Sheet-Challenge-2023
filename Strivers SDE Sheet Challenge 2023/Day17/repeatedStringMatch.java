class Solution {
    public int repeatedStringMatch(String A, String B) {
    
    String res = "";
    int count = 0;
    while(res.length() < B.length()){
        res += A;
        count++;
    }

    if(res.indexOf(B) != -1) return count;

    res += A;
    count++;

        if(res.indexOf(B) != -1) return count;
return -1;

}
}