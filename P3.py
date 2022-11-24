# TC : O(2n) = O(n)
# SC : O(1)
## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        hasCycle = False
        while fast!=None and fast.next!=None:
            slow = slow.next
            fast = fast.next.next
            # print(fast.val, slow.val)
            if slow == fast:
                hasCycle = True
                break 
            
        if not hasCycle:
            return None
        fast = head
        while fast!=slow:
            fast = fast.next
            slow = slow.next
        # print(fast.val)
        return fast