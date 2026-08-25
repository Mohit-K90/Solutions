class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums ){
            set.add(i);
        }
        for(int i = 1; ;i++){
            boolean s = set.contains(k*i);
            if(!s){
                return k*i;
            }
            
        }
    }
}