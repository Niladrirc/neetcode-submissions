class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, k = nums.length-1;
        while (i<k) {
            if (nums[i] == val) {
                int t = nums[i];
                for (int j=i; j<nums.length-1; j++) {
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = t;
                k--;
            } else {
                i++;
            }
        }

        for (int j=0; j<nums.length; j++) {
            if (nums[j] == val) {
                return j;
            }
        }

        return nums.length;
    }
}