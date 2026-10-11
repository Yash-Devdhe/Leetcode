class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length-1;i++){
            int curr = nums[i];
            int comp = target-curr;
            for(int j=i+1;j<nums.length;j++){
                if(comp==nums[j]){
                    res[0] = i;
                    res[1] = j;
                
                }
            }
        }
        return res;
    }
}