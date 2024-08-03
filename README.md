# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

Here in this approach the base case would be if list is empty or contains only one node then we will return head. We will call the recursive reverse the rest of the list starting from the second node. To re-link the nodes we can set the node's next pointer to the current node to reverse the link then set the current node's next pointer to null to avoid any cycles. We can solve same problem with iterative solution as well. Here we can start with two pointers prev initialized to null and curr pointer initialized to head to keep track of the previous node and the current node. Then we will iterate through the list at each step we will store the next node in a temporary variable and reverse the current node's pointer to point to the previous node and then move the prev and curr pointers one step forward. Once list is done then prev will point to the new head of reversed list.

## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

In this approach first we will create a dummy node that points to the head of the list. Then we will initialize two pointers slow and fast both pointing to the dummy node. Then we will move fast pointer to n+1 steps ahead maintaining a gap of n nodes between slow and fast. Then we will move both slow and fast pointers one step at a time until fast pointer reaches the end of the list. At this time slow pointer will be just before the node to be removed. Then we will adjust next pointer of the slow to skip the target node which will remove it from the list.

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

In this approach we will use slow and fast pointers. We will move the slow pointer one step at a time and fast pointer by two steps at a time. If they meet, a cycle exists. If a cycle is detected we will reset the fast pointer to the head and move both slow and fast pointers by one step at a time. The point where they'll meet is the start of the cycle. We will return the node where slow and fast meet which will be the entry point of the cycle.