class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap();
        for (int i : nums) {
            if (freq.containsKey(i)) {
                int count = freq.get(i);
                freq.put(i, count+1);
            } else {
                freq.put(i, 1);
            }
        }
        int maxValue = 0;
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                result = key;
            }
        }
        return result;
    }
}