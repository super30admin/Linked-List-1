"""

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:

Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Example 3:

Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.

Time Complexity: O(n) - The first phase (cycle detection) runs in O(n), and the second phase (finding entry) also runs in O(n), leading to an overall O(n).
Space Complexity: O(1) - Only two pointers are used, requiring constant extra space.

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# Approach: used Floyd’s Cycle Detection Algorithm (Tortoise and Hare) to detect a cycle by moving two pointers at different speeds.  
# If a cycle is detected, used a second pointer starting from the head to find the entry point of the cycle by moving both pointers one step at a time.  
# If no cycle is found, returned None.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        slow = fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                dummy = head
                while slow != dummy:
                    slow = slow.next
                    dummy = dummy.next

                return slow

        return None
      
