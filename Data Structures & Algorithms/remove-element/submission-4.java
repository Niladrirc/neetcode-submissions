class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] == val) {
                int temp = nums[i];
                int x = i;
                while (x+1 <= j) {
                    nums[x] = nums[x+1];
                    x++;
                }
                nums[x] = temp;
                j--;
            } else {
                i++;
            }
        }
        for (i=0;i<nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }
        }
        return nums.length;
    }
}