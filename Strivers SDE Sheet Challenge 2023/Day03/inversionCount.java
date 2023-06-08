import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long a[], int n) {
        // Write your code here.
        return mergeSort(a, 0, n-1);
    }

    public static long merge(long[] a,int low, int mid, int high){
        List<Long> list = new ArrayList<Long>();
        int invCount = 0;
        int left = low;
        int right = mid;

        while(left < mid && right <= high){
            if(a[left] <= a[right]){
                list.add(a[left]);
                left++;
            }else{
                
                list.add(a[right]);
                right++;
                invCount = invCount + ( mid-left);
            }
        }

        while(left < mid){
            list.add(a[left++]);
        }
        while(right <= high){
            list.add(a[right++]);
        }
        int k = 0;
        for(int i=low; i<=high; i++){
            a[i] = list.get(k++);
        }

        return invCount;

    }

    public static long mergeSort(long[] a, int low, int high){
        
        int mid = 0,invCount = 0;

        if(high > low){
            mid = (low+high)/2;

            invCount += mergeSort(a,low,mid);
            invCount += mergeSort(a,mid+1,high);

            invCount += merge(a,low,mid+1,high);
        }
        return invCount;
    }
}
