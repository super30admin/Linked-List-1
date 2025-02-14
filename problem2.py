# Time Complexity : O(n), single pass
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-99, head)
        back = dummy
        fwd = head
        for i in range(n):
            fwd = fwd.next
        
        while fwd:
            fwd = fwd.next
            back = back.next
        
        to_del = back.next
        if to_del == head:
            return head.next
        back.next = to_del.next
        to_del.next = None

        return head
