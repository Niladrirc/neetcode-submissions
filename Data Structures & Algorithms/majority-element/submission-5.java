class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap();
        for (int i : nums) {
            freq.put(i, freq.computeIfAbsent(i, key -> 0) + 1);
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