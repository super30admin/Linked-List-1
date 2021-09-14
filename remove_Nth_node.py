# TC : O(n)
# SC : O(1)
# Approach to solve the problem:

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = fast = head              # Given 2 pointers on head
        
        for i in range(n):              # Move fast pointer till n
            fast = fast.next
            
        if fast is None:                # only for 1 value
            return head.next
            
        while fast.next:                # As we have the differnce of n now move both by 1 step
            fast = fast.next
            slow = slow.next
            
        slow.next = slow.next.next      # skip the element
        return head