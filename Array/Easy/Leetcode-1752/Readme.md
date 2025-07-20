# Leetcode 1752 - Check if Array is Sorted and Rotated

## Problem Statement
Given an array `nums`, return `true` if the array was originally sorted in non-decreasing order, then rotated some number of times (including 0), otherwise return `false`.

## Approach
- Count how many times `nums[i] > nums[(i + 1) % n]` occurs.
- If it occurs more than once → not rotated sorted.

## Time Complexity
- **O(n)** — single pass through the array.

## Space Complexity
- **O(1)** — constant space.

## Code
See `Solution.java`
