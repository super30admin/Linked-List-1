'''

TC: O(n)
SC: O(n)

'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        while not head or not head.next:
            return head
        
        ret = self.reverseList(head.next)
        
        head.next.next = head
        head.next = None
        
        return ret