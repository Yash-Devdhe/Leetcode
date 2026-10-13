class Solution {
    public long maxAlternatingSum(int[] nums) {
        Integer arr[] = new Integer[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        int n = arr.length;
        long sum = 0;
        Arrays.sort(arr, (a, b) -> Long.compare(Math.abs((long) a), Math.abs((long) b)));
        for(int i=0; i<arr.length; i++){
            if(i<n/2){
                sum -= arr[i]*arr[i];
            }
            else{
                sum += arr[i]*arr[i];
            }
        }
        return sum;
    }
}