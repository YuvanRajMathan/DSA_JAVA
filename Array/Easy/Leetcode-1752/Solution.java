class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current and next (circular using %)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) return false; // More than one break
        }

        return true;
    }
}
