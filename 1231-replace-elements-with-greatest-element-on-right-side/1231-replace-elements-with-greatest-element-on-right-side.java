class Solution {
    public int[] replaceElements(int[] arr) {
        int currmax = -1;
        int temp;
        for(int i = arr.length-1 ; i>=0 ; i-- ){
            temp = arr[i];
            arr[i] = currmax;
            currmax = Math.max(temp , arr[i]);
            
        }
    return arr;}
}