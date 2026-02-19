class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];

        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }

        for(int i=0;i<n;i++){
            int left = (i==0) ? 0 : pref[i-1];
            int right = pref[n-1] - pref[i];

            if ( left==right){
                return i ;
            }
        }

        return -1;

        
    }
}