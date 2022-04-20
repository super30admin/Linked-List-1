'''https://leetcode.com/problems/linked-list-cycle-ii/
Given the head of a linked list, return the node where the cycle begins. 
If there is no cycle, return null.
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def detectCycle(self, head: 'Optional[ListNode]') -> 'Optional[ListNode]':
        if head is None: return None
        slow = head
        fast = head
        has_cycle = False
        
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow is fast:
                has_cycle = True
                break
        
        if has_cycle:
            fast = head
            while fast is not slow:
                fast = fast.next
                slow = slow.next
            return fast
        else:
            return
        