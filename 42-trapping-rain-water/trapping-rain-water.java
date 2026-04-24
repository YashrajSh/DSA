class Solution {
    public int trap(int[] height) {
        

        int left = 0 ;
        int right = height.length-1;
        int leftmax = height[left];
        int rightmax = height[right];
        int res = 0;

        while(left<right){
            if(leftmax < rightmax){
                left+=1;
                leftmax = Math.max(leftmax , height[left]);
                res+= leftmax-height[left];
            }
            else {
                right-=1;
                rightmax = Math.max(rightmax, height[right]);
                res += rightmax - height[right];
            }
             
        }
        
        return res;
        
    }
}