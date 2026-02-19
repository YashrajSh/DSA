class Solution {
    public int largestAltitude(int[] gain) {
        int maxaltitude = 0;
        int currentaltitude = 0;

        for(int i=0;i<gain.length;i++){
            currentaltitude +=gain[i];
            maxaltitude = Math.max(maxaltitude,currentaltitude);
        }

        return maxaltitude;
        
    }
}