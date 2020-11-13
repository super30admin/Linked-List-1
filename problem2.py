# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy=ListNode(None)
        dummy.next=head
        i=dummy
        j=dummy
        count=1
        #below while loop increase the j pointer and make the difference with i 
        while count<=n:
            print(j.val)
            j=j.next
            count+=1
        while j!=None and j.next!=None:
            print(j.val)
            j=j.next
            i=i.next
        print(i.next)
        i.next=i.next.next
        return dummy.next