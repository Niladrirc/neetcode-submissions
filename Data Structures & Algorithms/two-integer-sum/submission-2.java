class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remain = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (remain.containsKey(nums[i])) {
                return new int[]{remain.get(nums[i]), i};
            }
            remain.put(target-nums[i], i);
        }
        return null;
    }
}
