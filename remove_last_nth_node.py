# Time Complexity : O(N) where N is number of nodes in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        i = 0
        dummy = ListNode(-1)
        dummy.next = head
        fast, slow = dummy, dummy
        while i <= n:
            fast = fast.next
            i += 1
        
        while fast is not None:
            slow = slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        
        return dummy.next