import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> a) 
    {
        // Write your code here.
        int n1=-1,n2=-1,c1=0,c2=0;
        int n = a.size();
        for(int i:a){
            
            if(i == n1)
                c1++;
            else if(i == n2)
                c2++;
            else if(c1==0){
                n1 = i;
                c1++;
            }else if(c2 == 0){
                n2 = i;
                c2++;
            } else{
                c1--;
                c2--;
            }
        }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        c1=0;
        c2=0;
        for(int i:a){
            if(i == n1) c1++;
            else if(i == n2) c2++;
        }
        
        if(c1>n/3) list.add(n1);
        if(c2>n/3) list.add(n2);
        
        return list;
    }
}