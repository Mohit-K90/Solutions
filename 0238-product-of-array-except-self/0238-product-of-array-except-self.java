class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer,Integer> prefixprod = new HashMap();
        int preprod = 1;
        for(int i = 0 ; i < nums.length ; i ++){
            if(i!=0) preprod = nums[i-1]*preprod;
            prefixprod.put(i,preprod);
        }
        HashMap<Integer,Integer> suffixprod = new HashMap();
        int suprod = 1;
        for(int i = nums.length-1 ; i>=0 ; i --){
            if(i!=nums.length-1) suprod = suprod*nums[i+1];
            suffixprod.put(i,suprod);
        }

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = prefixprod.get(i) * suffixprod.get(i);
        }
    return nums;
    }
    
}