# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
* keeping global reversed ptr that is head of reversed LL.
* helper(curr, prev)
* keeping fast ptr ahead of curr, using prev to make connection with curr. T - O(n),S- O(1). we can have bruteforce - keeping all ele in array than reversing but it occupies extra space.

## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
* point slow, fast ptr to dummy element.
* return dummy.next
* in first loop move fast ptr before the node to be deleted, then slide them till fast reaches null & slow reaches till 1 node before delete. remove the slow.next element from list.
* T- O(n) S-O(1)

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
*
*
*

