#  Problem: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
#  Time Complexity: O(n)
#  Space Complexity: O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast = head
        slow = head
        
        for i in range(n):
            fast = fast.next 
            
        if fast is None:
            return head.next
        
        while fast.next is not None:
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next
        
        return head