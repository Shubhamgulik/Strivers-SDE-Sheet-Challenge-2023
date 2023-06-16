// Brute Force : 

class Solution {
    public int removeDuplicates(int[] arr) {

        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }
}

// Optimised : 

class Solution {
    public int removeDuplicates(int[] arr) {

        int i=0;

        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++; 
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
