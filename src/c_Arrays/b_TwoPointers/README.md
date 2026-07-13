# Two Pointers Pattern

The **Two Pointers** technique is one of the most important patterns in Data Structures and Algorithms. It uses **two indices (pointers)** to traverse an array efficiently instead of using nested loops.

Instead of checking every possible pair (`O(n²)`), two pointers often reduce the complexity to **O(n)**.

---

# When to Use Two Pointers?

Use this pattern when you see:

- Sorted array
- Need to compare two elements
- Pair/Triplet problems
- Reverse or swap elements
- Remove duplicates
- Move elements (zeros, negatives, etc.)
- Partition an array
- Palindrome checking
- Find a target sum

---

# Types of Two Pointer Pattern

## 1. Opposite Ends

Pointers start from **both ends** and move toward each other.

```
left                 right
 ↓                     ↓
[1,2,3,4,5,6,7,8,9]
```

### Used For

- Pair Sum
- Palindrome
- Container problems
- Trapping Rain Water

### Time Complexity

```
O(n)
```

### Examples

- LC 167 - Two Sum II
- LC 125 - Valid Palindrome
- LC 11 - Container With Most Water
- LC 42 - Trapping Rain Water

---

## 2. Same Direction (Slow & Fast)

Both pointers move **left → right**, but at different speeds or purposes.

```
slow
 ↓
fast
 ↓
[0,1,0,3,12]
```

Usually

- slow → correct position
- fast → scans array

### Used For

- Remove duplicates
- Move zeros
- Rearrange elements

### Time Complexity

```
O(n)
```

### Examples

- LC 26 - Remove Duplicates from Sorted Array
- LC 27 - Remove Element
- LC 283 - Move Zeroes

---

## 3. Sliding Window (Special Two Pointer)

Both pointers move in the same direction while maintaining a **window**.

```
left        right
 ↓            ↓
[1,2,3,4,5,6]
```

The window expands or shrinks depending on the condition.

### Used For

- Longest Subarray
- Smallest Subarray
- Substring problems

### Examples

- LC 209 - Minimum Size Subarray Sum
- LC 3 - Longest Substring Without Repeating Characters
- LC 424 - Longest Repeating Character Replacement

> **Note:** Sliding Window is considered an advanced form of the Two Pointer technique and is usually studied separately.

---

## 4. Partitioning

Pointers rearrange elements around a pivot or condition.

```
low        high
 ↓           ↓
[2,0,2,1,1,0]
```

### Used For

- Sorting
- Partitioning
- Rearranging

### Examples

- LC 75 - Sort Colors
- Quick Sort Partition
- Dutch National Flag Problem (GFG)

---

## 5. Multiple Pointers

Uses **three or more pointers**.

### Used For

- Triplets
- Quadruplets
- Advanced searching

### Examples

- LC 15 - 3Sum
- LC 18 - 4Sum

---

# How to Identify Two Pointer Problems?

Ask yourself these questions:

✅ Is the array sorted?

✅ Do I need to find a pair?

✅ Can I avoid nested loops?

✅ Am I comparing two positions?

✅ Am I removing duplicates?

✅ Am I moving elements in-place?

✅ Am I reversing the array?

If the answer is **YES** to any of these, think about the **Two Pointer** pattern.

---

# Common Interview Keywords

- Pair Sum
- Target Sum
- Sorted Array
- Remove Duplicates
- Reverse
- Palindrome
- Move Zeroes
- Rearrange
- Merge
- Closest Pair
- Triplet
- Quadruplet

---

# Advantages

- Reduces nested loops
- Improves O(n²) to O(n)
- Constant extra space
- Easy to implement
- Frequently asked in interviews

---

# Limitations

- Often requires a sorted array
- Not suitable for every array problem
- Pointer movement must be carefully designed

---

# Top Interview Problems

## Easy

- LC 26 - Remove Duplicates from Sorted Array
- LC 27 - Remove Element
- LC 125 - Valid Palindrome
- LC 167 - Two Sum II
- LC 283 - Move Zeroes
- LC 977 - Squares of a Sorted Array

---

## Medium

- LC 11 - Container With Most Water
- LC 15 - 3Sum
- LC 16 - 3Sum Closest
- LC 18 - 4Sum
- LC 75 - Sort Colors

---

## Hard

- LC 42 - Trapping Rain Water

---

# GFG Problems

- Pair with Given Sum
- Remove Duplicates from Sorted Array
- Dutch National Flag Problem
- Trapping Rain Water
- Merge Without Extra Space

---

# Pattern Flow

```
Array Problem
      │
      ▼
Need two positions?
      │
     Yes
      │
      ▼
Array Sorted?
      │
 ┌────┴────┐
 │         │
Yes       No
 │         │
 ▼         ▼
Opposite   Same Direction
Ends       (Slow & Fast)
 │
 ▼
Need a dynamic range?
 │
 ▼
Sliding Window
 │
 ▼
Need rearrangement?
 │
 ▼
Partitioning
```

---

# Complexity

| Pattern | Time | Space |
|---------|------|-------|
| Opposite Ends | O(n) | O(1) |
| Slow & Fast | O(n) | O(1) |
| Sliding Window | O(n) | O(1) |
| Partitioning | O(n) | O(1) |
| Multiple Pointers | O(n²) (3Sum) | O(1) |

---

# Key Takeaways

- Two Pointers is a technique to optimize array traversal.
- Most problems run in **O(n)** time.
- Learn the pointer movement before coding.
- Sliding Window is an extension of Two Pointers.
- Master **Opposite Ends** and **Slow & Fast** first—they appear most frequently in coding interviews.