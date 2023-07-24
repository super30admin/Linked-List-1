# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode(-1)
        dummy.next=head
        
        finish=dummy
        count=0
        while(count<n):
            count+=1
            finish=finish.next
        start=dummy
        
        while finish.next is not None:
            start=start.next
            finish=finish.next
        temp=start.next
        start.next=start.next.next
        temp.next=None

        return dummy.next