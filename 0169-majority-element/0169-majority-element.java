class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int ele = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(max<e.getValue()){
                max = e.getValue();
                ele = e.getKey();
            }
            
        }
        return ele;
    }
}