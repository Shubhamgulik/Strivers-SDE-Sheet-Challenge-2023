class Solution {
    public int majorityElement(int[] a) {
        int element = 0;
        int count = 0;

        for(int i=0; i<a.length; i++){
            if(count == 0){
                element = a[i];
                count = 1;
            }else if(element == a[i]){
                count++;
            }else{
                count--;
            }
        }

        return element;
    }
}