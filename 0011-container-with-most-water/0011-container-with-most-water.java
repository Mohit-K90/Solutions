class Solution {
    public int maxArea(int[] height) {
        int currmaxarea = 0 ; 
        int x = 0, y = height.length-1;
        while(x<y){
            int currarea = (y-x)*(Math.min(height[x],height[y]));
            if(currarea>currmaxarea){
                currmaxarea = currarea;
            }
            if(height[x]>height[y]) y--;
            else x++;
        }
        return currmaxarea;
    }
}