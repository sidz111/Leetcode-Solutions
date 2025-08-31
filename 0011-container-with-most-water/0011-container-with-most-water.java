class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int area = 0;
        while(left<right){
        int h = Math.min(height[left], height[right]);
        int w = right - left;
        int a = h*w;
            if(a>area){
                area = a;
            }
            if(height[left]<height[right]){
                    left++;
                }
                else{
                    right--;
                }
        }
return area;
    }
}