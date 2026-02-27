# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Use two pointers moving at different speeds to check if there’s a cycle.
# If they meet, reset one to the head and walk both one step at a time.
# They meet again at the node where the cycle starts.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None

        slow, fast = head, head
        flag = False

        while fast.next is not None and fast.next.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                flag = True
                break

        if not flag:
            return None

        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow

        
        