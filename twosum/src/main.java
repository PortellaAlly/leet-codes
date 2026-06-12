class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int j;

        for (j =  nums.length -1; j > 0; j--){
            for (int i = 0; i < j; i++){
                int currentSum = nums[i] + nums[j];
                if (currentSum == target){
                return new int[]{i, j};
            }
        }
        }
        return new int[]{ -1, -1};      
        
    }
}