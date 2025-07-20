# Leetcode 49 - Group Anagrams

## Problem Statement
Given an array of strings, group the anagrams together. You can return the answer in any order.

### Example
Input: `["eat", "tea", "tan", "ate", "nat", "bat"]`  
Output: `[["bat"],["nat","tan"],["ate","eat","tea"]]`

## Approach

We use a HashMap to group words that are anagrams.  
- Sort each string to use it as a key (e.g., "eat" -> "aet")
- Use this sorted string to group all anagrams together in the map.

### Why this works:
Anagrams will have the same characters when sorted. So using the sorted version as a key ensures that all anagrams fall into the same group.

## Complexity
- Time: O(n * k log k) where `n` is number of strings and `k` is max length of a string
- Space: O(n) for the map storing the grouped anagrams

## Java Code

```java
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
