class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> m = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < target.length; i++) {
            while (target[i] > num) {
                m.add("Push");
                m.add("Pop");
                num++;
            }
            m.add("Push");
            num++;
        }
        return m;
    }
}