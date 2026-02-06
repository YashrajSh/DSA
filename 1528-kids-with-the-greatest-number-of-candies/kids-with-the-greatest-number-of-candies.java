class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> result = new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            boolean isgreatest=true;
            int current=candies[i]+extraCandies ;
            for(int j=0;j<candies.length;j++){
                if(candies[j]>current){
                    isgreatest = false;
                    break;
                }
            }
                result.add(isgreatest);

            }
            return result;
            

        }
        
        
    }
