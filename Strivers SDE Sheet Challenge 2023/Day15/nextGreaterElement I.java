// Trvaerse left to right : 

import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] a, int n) {	
		//Write Your code here
		Stack<Integer> st=new Stack<>();
        Map<Integer, Integer> map=new HashMap<>();
        
        for(int i = 0; i<a.length; i++){
            while(!st.isEmpty() && a[st.peek()] < a[i]){
                map.put(st.pop(),a[i]);
                // System.out.println(st.pop()+" --> "+a[i]);
            }
            st.push(i);
        }
        
        
        for(int i=0; i<a.length; i++){
            a[i] = map.getOrDefault(i,-1);
        }
        
        return a;

	}

}

// Traverse Right to Left : 

import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] a, int n) {	
		//Write Your code here
		Stack<Integer> st=new Stack<>();
        
        int[] nge=new int[n];

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= a[i]){
                st.pop();
            }
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(a[i]);
        }
        
        return nge;

	}

}
