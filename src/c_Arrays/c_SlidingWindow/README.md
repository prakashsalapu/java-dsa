# Sliding Window Pattern

The **Sliding Window** pattern is an optimization technique used to solve problems involving **subarrays** or **substrings**.

Instead of recalculating every possible window (which often takes **O(n²)**), Sliding Window maintains a **dynamic window** and updates it efficiently, reducing the complexity to **O(n)**.

> **Note:** Sliding Window is a specialized application of the **Two Pointers** technique.

---

# When to Use Sliding Window?

Use this pattern when you see:

- Subarray
- Substring
- Contiguous elements
- Window of size **K**
- Longest/Shortest subarray
- Maximum/Minimum sum
- Count subarrays
- Distinct characters/elements
- At most K / Exactly K

---

# Types of Sliding Window

## 1. Fixed Size Window

The window size is **constant**.

```
Window Size = 3

        Window
          ▼
[2, 1, 5, 1, 3, 2]
```

Move the window one step at a time.

```
Add new element
Remove old element
```

### Used For

- Maximum Sum of Size K
- Average of K elements
- Count windows
- Fixed-length substring problems

### Time Complexity

```
O(n)
```

### Examples

- LC 643 - Maximum Average Subarray I
- LC 1456 - Maximum Number of Vowels in a Substring
- LC 1343 - Number of Subarrays of Size K

---

## 2. Variable Size Window

The window size changes depending on the condition.

```
left           right
 ↓               ↓
[2,3,1,2,4,3]
```

The window

- expands
- shrinks
- expands again

until the required condition is satisfied.

### Used For

- Longest Subarray
- Smallest Subarray
- Longest Substring
- Character replacement
- Fruit baskets

### Time Complexity

```
O(n)
```

### Examples

- LC 209 - Minimum Size Subarray Sum
- LC 3 - Longest Substring Without Repeating Characters
- LC 424 - Longest Repeating Character Replacement
- LC 904 - Fruit Into Baskets

---

## 3. Sliding Window + HashMap / HashSet

Used when tracking

- frequencies
- distinct elements
- duplicate characters

```
HashMap
A → 2
B → 1
C → 3
```

### Used For

- Distinct Characters
- Character Frequency
- Duplicate Detection

### Examples

- LC 3 - Longest Substring Without Repeating Characters
- LC 567 - Permutation in String
- LC 438 - Find All Anagrams in a String
- LC 76 - Minimum Window Substring

---

## 4. Sliding Window + Prefix Sum

Some subarray problems can be solved using either **Sliding Window** or **Prefix Sum**.

### Used For

- Binary Arrays
- Counting Subarrays
- Sum Constraints

### Examples

- LC 930 - Binary Subarrays With Sum
- LC 1248 - Count Number of Nice Subarrays

---

# How to Identify Sliding Window Problems?

Ask yourself these questions:

✅ Does the problem mention **subarray** or **substring**?

✅ Are the elements **contiguous**?

✅ Am I asked to find the **longest** or **shortest** window?

✅ Is there a fixed window size **K**?

✅ Can I expand and shrink a window instead of restarting every time?

✅ Am I checking a condition while moving through the array/string?

If the answer is **YES**, think about the **Sliding Window** pattern.

---

# Common Interview Keywords

- Subarray
- Substring
- Contiguous
- Window
- K elements
- Longest
- Shortest
- Maximum
- Minimum
- At Most K
- Exactly K
- Distinct Characters
- Character Frequency

---

# Advantages

- Reduces O(n²) brute force to O(n)
- Efficient for contiguous sequences
- Constant extra space (most problems)
- Easy once the window logic is understood
- Very common in coding interviews

---

# Limitations

- Works only for contiguous elements
- Variable windows require careful shrinking logic
- Some sum problems with negative numbers need Prefix Sum instead

---

# Fixed Window Template

```java
int windowSum = 0;

for (int i = 0; i < k; i++)
    windowSum += nums[i];

int ans = windowSum;

for (int i = k; i < nums.length; i++) {
    windowSum += nums[i];
    windowSum -= nums[i - k];
    ans = Math.max(ans, windowSum);
}
```

---

# Variable Window Template

```java
int left = 0;

for (int right = 0; right < nums.length; right++) {

    // Expand window

    while (/* condition not satisfied */) {
        // Shrink window
        left++;
    }

    // Update answer
}
```

---

# Top Interview Problems

## Easy

- LC 643 - Maximum Average Subarray I

---

## Medium

- LC 209 - Minimum Size Subarray Sum
- LC 3 - Longest Substring Without Repeating Characters
- LC 904 - Fruit Into Baskets
- LC 424 - Longest Repeating Character Replacement
- LC 1456 - Maximum Number of Vowels
- LC 567 - Permutation in String
- LC 438 - Find All Anagrams in a String
- LC 930 - Binary Subarrays With Sum
- LC 1248 - Count Number of Nice Subarrays

---

## Hard

- LC 76 - Minimum Window Substring

---

# GFG Problems

- Maximum Sum Subarray of Size K
- First Negative Integer in Every Window
- Count Distinct Elements in Every Window
- Smallest Window Containing All Characters
- Longest Subarray with Sum K (Positive Numbers)

---

# Pattern Flow

```
Array / String Problem
          │
          ▼
Contiguous elements?
          │
         Yes
          │
          ▼
Window Size Fixed?
      ┌───┴───┐
      │       │
     Yes      No
      │       │
      ▼       ▼
 Fixed     Variable
 Window     Window
      │
      ▼
Need frequency tracking?
      │
     Yes
      │
      ▼
HashMap / HashSet
      │
      ▼
Need counting or binary arrays?
      │
     Yes
      │
      ▼
Sliding Window + Prefix Sum
```

---

# Complexity

| Type | Time | Space |
|------|------|-------|
| Fixed Window | O(n) | O(1) |
| Variable Window | O(n) | O(1) |
| Window + HashMap | O(n) | O(k) |
| Window + HashSet | O(n) | O(k) |

> **k** = Number of distinct elements/characters inside the window.

---

# Sliding Window vs Two Pointers

| Two Pointers | Sliding Window |
|--------------|----------------|
| General pointer technique | Specialized Two Pointer technique |
| May compare two positions | Maintains a contiguous window |
| Used in sorted arrays | Used for subarrays/substrings |
| Opposite or same direction | Always moves in the same direction |
| Pair problems | Window problems |

---

# Key Takeaways

- Sliding Window is an extension of the **Two Pointers** technique.
- It is mainly used for **subarray** and **substring** problems.
- There are two primary types: **Fixed Window** and **Variable Window**.
- HashMap or HashSet is commonly combined with Sliding Window for frequency-based problems.
- Whenever you see **contiguous elements**, **window size K**, **longest**, or **shortest**, Sliding Window should be one of your first approaches.