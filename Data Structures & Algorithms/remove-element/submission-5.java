class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int k = -1, j = nums.length - 1;
        while (j >= 0) {
            if (nums[j] != val) {
                k = j;
                break;
            }
            j--;
        }
        if (k == -1) {
            return 0;
        }

        // Here we have got a propable valid range
        for (j = k; j >= 0; j--) {
            if (nums[j] == val) {
                // swap and decrement range
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k--] = temp;
            }
        }
        return k+1;
    }
}