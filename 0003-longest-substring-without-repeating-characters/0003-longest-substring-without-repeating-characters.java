class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int currmax = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length(); i++){
            while(!set.add(s.charAt(i))){
                currmax --;
                set.remove(s.charAt(left));
                left ++;
            }
            set.add(s.charAt(i));
            currmax++;
                if(currmax>max){
                    max = currmax;
                }
        }
    return max;}
}