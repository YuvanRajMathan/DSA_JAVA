import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums)); // Output: true
    }
}
