class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pairidx = new HashMap<>();
        for(int i =0 ; i<nums.length;i++){
            int num = nums[i];
            if(pairidx.containsKey(target-num)){
            return new int[] {i,pairidx.get(target-num)};
        }
            pairidx.put(num,i);
        }
        return new int[]{};
        
    
}
}
