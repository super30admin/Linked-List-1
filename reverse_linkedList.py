# TC
0(N)
# SC
0(1)

Iterative Method

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        s = head
        
        while s is not None:
            f = s.next
            s.next=prev
            prev=s
            s=f
            
        return prev
      
      
# Recursive method

# TC & SC
0(N)

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head
        p = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return p
