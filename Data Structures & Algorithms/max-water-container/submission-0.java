class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int res = 0,space = 0;
        while(l<r){
            if(heights[l]<heights[r]){
                space = (r-l)*heights[l];
                l++;
            }else{
                space = (r-l)*heights[r];
                r--;
            }
            res = Math.max(space,res);

        }
        return res;
    }
}
