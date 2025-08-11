"""
Implemented using two pointers, slow and fast, to detect the cycle, and then used Floyd’s Cycle Detection Algorithm to find the node where the cycle starts.
Time Complexity: O(n)
Space Complexity: O(1)
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return None

        flag = False
        slow = head
        fast = head
        while fast and fast.next:
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