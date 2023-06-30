class Solution {
    public int[] nextGreaterElements(int[] a) {
        int n = a.length;
        Stack<Integer> stack=new Stack<>();
        int nge[] = new int[n];

        for(int i=(2*n)-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= a[i%n]){
                stack.pop();
            }
            
            if(i < n){
                nge[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(a[i%n]);
        }

        return nge;
        
    }
}