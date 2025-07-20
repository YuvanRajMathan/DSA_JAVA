# Leetcode 217 - Contains Duplicate

🔗 [Leetcode Link](https://leetcode.com/problems/contains-duplicate/)

## 🧠 Problem Statement

Given an integer array `nums`, return `true` if any value appears **at least twice**, and return `false` if every element is distinct.

---

### ✅ Constraints
- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

---

## 🚀 Approach

- Use a `HashSet` to track elements we've already seen.
- If we ever find a duplicate, return `true`.
- If we finish looping without finding one, return `false`.

---

## 💡 Example

### Input:
```java
nums = [1, 2, 3, 1]
