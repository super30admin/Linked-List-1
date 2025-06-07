# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Time complexity - o(n)
# Space complexity - o(1)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        prev = None
        current = head

        while current:
            nxt = current.next
            current.next = prev
            prev = current
            current = nxt

        return prev