class Solution {
    public int removeElement(int[] nums, int val) {
        int k;
        for (k=nums.length-1; k>=0; k--) {
            if (nums[k] != val) {
                break;
            }
        }
        for (int i=k; i>=0; i--) {
            if (nums[i] == val) {
                int t = nums[i];
                nums[i] = nums[k];
                nums[k--] = t;
            }
        }
        return k+1;
    }
}