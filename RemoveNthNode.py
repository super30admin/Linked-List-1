class ListNode:
    def __init__(self,val=0,next=None):
        self.val=val
        self.next=next

class Solution:
    def removeNthFromEnd(self,head,n):
        dummy=ListNode(0,head)
        slow=fast=dummy

        for _ in range(n+1):
            fast=fast.next

        while fast:
            slow=slow.next
            fast=fast.next

        slow.next=slow.next.next

        return dummy.next
    
def buildLinkedList(values):
    if not values:
        return None
    head=ListNode(values[0])
    current=head
    for val in values[1:]:
        current.next=ListNode(val)
        current=current.next
    return head

def printLinkedList(head):
    result=[]
    while head:
        result.append(head.val)
        head=head.next
        print(result)

head=buildLinkedList([1,2,3,4,5])
sol=Solution()
newHead=sol.removeNthFromEnd(head,2)
printLinkedList(newHead)
            