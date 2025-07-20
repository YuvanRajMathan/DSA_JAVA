
---

## Approach

1. If the lengths are different, they can't be anagrams.
2. Use a frequency array of size 26 (for each lowercase letter).
3. Increment the count for each character in `s`, and decrement for `t`.
4. At the end, if all values in the array are 0, the strings are anagrams.

---

## Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the string.
- **Space Complexity:** O(1), since the array size is fixed (26).

---

## Code
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
