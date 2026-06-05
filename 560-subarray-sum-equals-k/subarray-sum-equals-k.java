class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0 ) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int prefixsum = 0;
        map.put(0,1);
        for(int i = 0 ; i< nums.length;i++){
            prefixsum+=nums[i];
            count+=map.getOrDefault(prefixsum-k,0);
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;


        
    }
}