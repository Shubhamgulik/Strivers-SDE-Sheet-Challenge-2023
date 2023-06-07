// Method 01

class Solution {
    public int[][] merge(int[][] a) {
     Arrays.sort(a,(x,y)->x[0]-y[0]);
    List<List<Integer>> list=new ArrayList<List<Integer>>();
    
    for(int i=0; i<a.length; i++){
        int start = a[i][0];
        int end = a[i][1];

        // If end is less than prevEnd
        if(!list.isEmpty() && end <= list.get(list.size()-1).get(1)){
            continue;
        }

        for(int j=i+1; j<a.length; j++){
            if(a[j][0] <= end){
                end = Math.max(end,a[j][1]);
            }else{
                break;
            }
        }
        List<Integer> temp=new ArrayList<>();
            
            temp.add(start);
            temp.add(end);
        list.add(temp);
    }

    int row = list.size();
        int col = list.get(0).size();
        
        int[][] result=new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result[i][j] = list.get(i).get(j);
            }
        }
        
        return result;
   
    

    }
}


// Method 02:

import java.util.Arrays;
import java.util.List;
class Solution {
    public int[][] merge(int[][] a) {
     Arrays.sort(a,(x,y)->x[0]-y[0]);
    List<List<Integer>> list=new ArrayList<List<Integer>>();
    
    for(int i=0; i<a.length; i++){
        int start = a[i][0];
        int end = a[i][1];


        if(list.isEmpty() || start > list.get(list.size()-1).get(1)){
            list.add(Arrays.asList(start,end));
        }else{
            list.get(list.size()-1).set(1,Math.max(list.get(list.size()-1).get(1),end));
        }
    }
    
    int row = list.size();
        int col = list.get(0).size();
        
        int[][] result=new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result[i][j] = list.get(i).get(j);
            }
        }
        
        return result;
   
    

    }
}