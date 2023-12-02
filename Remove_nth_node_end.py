# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dup=ListNode(-1,-1)
        dup.next=head
        fast=dup
        slow=dup
        c=0
        while c<=n and fast!=None:
            fast=fast.next
            c+=1
            
        print(dup)
        # print(fast.val)
        while fast!=None:
            fast=fast.next
            slow=slow.next
        if slow.next!=None and slow.next.next!=None:
            slow.next=slow.next.next
        else:
            slow.next=None

        return dup.next
        