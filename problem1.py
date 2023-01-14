#time O(N)
#space O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp=head
        curr=None
        while temp:
            t=temp.next
            temp.next=curr
            curr=temp
            temp=t
        return curr
            
            