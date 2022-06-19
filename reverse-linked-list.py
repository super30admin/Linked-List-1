# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None: return head
        prev=None
        curr=head
        fast=head.next
        while fast!=None:
            curr.next=prev
            prev=curr
            curr=fast
            fast=fast.next
        curr.next=prev
        return curr
    # Time Complexity: O(n)
    # Space Complexity: O(n)
    # def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
    #     if head==None or head.next==None: return head
    #     rev=self.reverseList(head.next)
    #     head.next.next=head
    #     head.next=None
    #     return rev