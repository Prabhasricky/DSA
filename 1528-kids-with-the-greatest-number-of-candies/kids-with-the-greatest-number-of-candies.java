class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> kidsWithMostCandies = new ArrayList<>();
        int maxCandies = 0;

        for(int candy : candies){
            if(candy > maxCandies){
                maxCandies = candy;
            }
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= maxCandies){
                kidsWithMostCandies.add(true);
            }else{
                kidsWithMostCandies.add(false);
            }
        }

        return kidsWithMostCandies;
    }
}