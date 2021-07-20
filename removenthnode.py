# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head==None or head.next==None:
            return None
        dummy=ListNode(784795)
        dummy.next=head
        slow=dummy
        fast=dummy
        count=0
        while count<=n:
            fast=fast.next
            count+=1
        while fast:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return dummy.next