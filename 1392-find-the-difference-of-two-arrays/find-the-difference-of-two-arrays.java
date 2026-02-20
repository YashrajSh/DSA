class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for(int value: nums1) setA.add(value);
        for(int value: nums2) setB.add(value);

        List<Integer> onlyinfirst = new ArrayList<>();
        for(int value:setA){
            if(!setB.contains(value)){
                onlyinfirst.add(value);
            }
        }

        List<Integer> onlyinsecond = new ArrayList<>();
        for(int value:setB){
            if(!setA.contains(value)){
                onlyinsecond.add(value);
            }
        }

        return List.of(onlyinfirst,onlyinsecond);

        
    }
}