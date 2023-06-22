class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans =new ArrayList<List<String>>();
        List<String> path=new ArrayList<>();

        partitioning(s,0,path,ans);

        return ans;
    }

    public static void partitioning(String s, int ind, List<String> path, List<List<String>> ans){
        if(ind == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i=ind; i<s.length(); i++){
            if(isPartition(s,ind,i)){
                path.add(s.substring(ind,i+1));
                partitioning(s,i+1,path,ans);
                path.remove(path.size()-1);
            }
        }

        return;
    }


    public static boolean isPartition(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }

        return true;
    }
}