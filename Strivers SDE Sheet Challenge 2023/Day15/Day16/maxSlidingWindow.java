class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;

        int[] ans=new int[n-k+1];
        int index = 0;

        Deque<Integer> dq=new ArrayDeque<>(); 
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            // Removing elements out of range
            if(!dq.isEmpty() &&  dq.peek() == i-k){
                dq.poll();
            }

            // Removing Smaller Elements
            while(!dq.isEmpty() && a[dq.peekLast()] < a[i]){
                dq.pollLast();
            }

            dq.offer(i);

            // Updating maxi and answer array
            // We will start inserting answers after 1st sub array only
            if(i >= k-1) ans[index++] = a[dq.peek()];
        }

        return ans;
    }
}