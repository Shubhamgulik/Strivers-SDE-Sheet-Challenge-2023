class Solution {
    public int largestRectangleArea(int[] a) {
        int n = a.length;
        Stack<Integer> st=new Stack<>();
        int maxi = 0;

        for(int i=0; i<=n; i++){
            while(!st.isEmpty() && ( i == n || a[st.peek()] >= a[i])){
                int height = a[st.peek()];
                st.pop();
                int width;
                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i-st.peek()-1;
                }
                maxi = Math.max(maxi,height*width);
            }
                st.push(i);

        }
        return maxi;
     }
}
