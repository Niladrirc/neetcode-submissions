class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueValues = new HashSet();

        for (int value : nums) {
            if (uniqueValues.contains(value)) {
                return true;
            }
            uniqueValues.add(value);
        }

        return false;
    }
}