class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        int expected = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == expected) {
                expected++;
            } else if (nums[i] > expected) {
                while (expected < nums[i]) {
                    res.add(expected);
                    expected++;
                }
                expected = nums[i] + 1;
            }
        }

        while (expected <= n) {
            res.add(expected);
            expected++;
        }

        return res;
    }
}
