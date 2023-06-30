import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> a, int n){
        // Write your code here.
        Stack<Integer> st=new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() >= a.get(i)){
                st.pop();
            }
            int x = a.get(i);

            if(st.isEmpty()){
                a.set(i,-1); 
            }else{
                a.set(i,st.peek());
            }

            st.push(x);
        }

        return a;
        
    }
}