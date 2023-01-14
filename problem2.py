#time O(N)
#space O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head==None:
            return []
        count=0
        head1=head
        new=head
        while head:
            count+=1
            head=head.next
        t=count-n-1
        if count==n:
            return head1.next
        if  t<0:
            return head
        while t!=0:
            head1=head1.next
            t-=1
        temp=head1
        if t==0:
            temp=temp.next.next
            head1.next=temp
        return new

        