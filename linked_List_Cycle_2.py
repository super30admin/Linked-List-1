# Leetcode 142. Linked List Cycle II

# Time Complexity :  O(n) where n is the size of the linked list

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Using a slow pointer moving at 1x speed and fast pointer moving at 2x speed, iterate over
# the linked list. If both the pointer meet at some point then a cycle exists. To find the head of the
# cycle reset one pointer and move both at 1x speed till they meet. The point they meet is the start
# of the cycle.

# Alternative: Use a hashset to store the nodes in the list. If a node is already present while iterating
# over the linked list then return it as its the start of the cycle. Else no cycle is present.
# Uses O(n) space for the hashset.

# Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        # Flag for loop detection
        flag = False

        # moving slow pointer at 1x and fast pointer at 2x on the list
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            # condition for loop detection
            if slow == fast:
                flag = True
                break

        if not flag:
            return None
        # Resetting one pointer to start of the list
        slow = head
        # Moving both slow and fast at 1x to find start of the loop
        while slow != fast:
            slow = slow.next
            fast = fast.next
        # When slow meets fast at 1x than that is the start of the loop
        return slow
