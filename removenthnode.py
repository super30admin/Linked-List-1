# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# By keeping fast and slow pointers.
# Keep two pointers - fast and slow. Move the fast pointer to the nth node.
# Move both the fast and slow pointer together.
# Time complexity - O(L) where L in the Length of the list
# Space complexity - O(1)
# Did this solution run on leetcode? - yes
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # move the fast pointer after the nth node
        fastPtr = head
        while n:
            fastPtr = fastPtr.next
            n -= 1
        
        # edge case
        if not fastPtr:
            return head.next
            
        # move the slow and fast pointer simultaneously.
        slowPtr = head
        while fastPtr.next:
            fastPtr = fastPtr.next
            slowPtr = slowPtr.next
        
        slowPtr.next = slowPtr.next.next
        
        return head
        