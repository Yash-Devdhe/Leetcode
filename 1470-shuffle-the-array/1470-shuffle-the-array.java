class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[n];
        int b[] = new int[n];
        int p = 0;
        while(p<n){
            a[p] = nums[p];
            p++;
        }
        int k = 0;
        while(p<nums.length){
            b[k] = nums[p];
            k++;
            p++;
        }
        int j = 0;
        k = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = a[j];
                j++;
            }
            else{
                nums[i] = b[k];
                k++;
            }
        }
        return nums;
    }
}