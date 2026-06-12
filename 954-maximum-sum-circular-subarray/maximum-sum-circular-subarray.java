class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum = 0;
        int maxsum = nums[0];
        int currentmax = 0;
        int  minsum=nums[0];
        int currentmin = 0;

        for( int num : nums){
            currentmax = Math.max(currentmax+num , num);
            maxsum = Math.max(maxsum,currentmax);
            currentmin = Math.min(currentmin+num,num);
            minsum = Math.min(minsum,currentmin);

            totalsum+=num;
        }

        if(maxsum<0){
            return maxsum;
        }

        return Math.max(maxsum , totalsum-minsum);
        
    }
}