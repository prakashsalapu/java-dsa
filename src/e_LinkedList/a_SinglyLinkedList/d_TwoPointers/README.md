# Two Pointer Positioning Pattern

## Overview

The Two Pointer Positioning pattern uses two pointers that move at the **same speed** but start from different positions in the linked list.

Unlike the Fast & Slow Pointer pattern, both pointers advance one step at a time. The power of this pattern comes from their initial positioning, which helps compare nodes, find intersections, or process paired nodes efficiently.

---

## Recognition

Consider this pattern when:

* Comparing two linked lists
* Comparing two halves of a linked list
* Finding the intersection point of two lists
* Processing twin pairs
* Traversing two linked list segments simultaneously

---

## Key Idea

```java
p1 = p1.next;
p2 = p2.next;
```

Both pointers move together.

The difference lies in:

* Where they start
* Which list/half they belong to
* What relationship is maintained between them

---

## Fast & Slow vs Two Pointer Positioning

### Fast & Slow Pointer

```java
slow = slow.next;
fast = fast.next.next;
```

Used for:

* Middle Node
* Cycle Detection
* Cycle Start
* Nth Node From End

---

### Two Pointer Positioning

```java
p1 = p1.next;
p2 = p2.next;
```

Used for:

* Comparing nodes
* Finding intersections
* Processing twin pairs

---

## Common Problems

### LC 160 - Intersection of Two Linked Lists

Concept:

* Two pointers start from different lists.
* When a pointer reaches null, redirect it to the other list.
* Eventually both pointers travel equal distance and meet at the intersection node.

Pattern:

```text
A + B
B + A
```

---

### LC 2130 - Maximum Twin Sum of a Linked List

Concept:

1. Find middle.
2. Reverse second half.
3. Use two pointers to evaluate twin pairs.

Pattern:

```java
p1 = firstHalf;
p2 = reversedSecondHalf;
```

---

## Mental Model

Think:

```text
Two pointers moving together
towards a common goal.
```

Instead of:

```text
One pointer chasing another.
```

---



## Time Complexity

Typical Complexity:

```text
Time  : O(n)
Space : O(1)
```

Most solutions require only pointer manipulation and a single traversal.

---

## Takeaway

When two pointers move at the same speed but start from different positions, think:

👉 Two Pointer Positioning Pattern

This pattern frequently appears after combining:

* Fast & Slow Pointer
* Reversal Pattern
* Linked List Traversal

Mastering it makes problems like Intersection, Palindrome, and Twin Sum much easier to recognize and solve.
