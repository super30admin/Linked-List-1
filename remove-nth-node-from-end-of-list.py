# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        dummy = ListNode(0)
        dummy.next = head
        
        p1 = dummy
        p2 = dummy
        #dummy=head
        
        while n>=0:
            p2=p2.next
            n = n-1

        while p2:
            p1=p1.next
            p2=p2.next
        #print(p1.val)
        #print(p2.val)
            
        p1.next= p1.next.next
        
        return dummy.next
        