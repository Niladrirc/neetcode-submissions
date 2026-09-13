class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> propableResultMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int requiredValue = target - nums[i];
            if (propableResultMap.containsKey(currentValue)) {
                return new int[] {propableResultMap.get(currentValue), i};
            }
            propableResultMap.put(requiredValue, i);
        }
        return null;
    }
}
