class ListNode:
    def __init__(self,val=0,next=None):
        self.val=val
        self.next=next

class Solution:
    def reverseList(self,head):
        prev=None
        curr=head

        while curr:
            next_temp=curr.next
            curr.next=prev
            prev=curr
            curr=next_temp
        return prev

def LinkedList(values):
    if not values:
        return None
    head=ListNode(values[0])
    curr=head 
    for val in values[1:]:
        curr.next=ListNode(val)
        curr=curr.next
    return head

def linkedListToList(head):
    result=[]
    while head:
        result.append(head.val)
        head=head.next
    return result

head=LinkedList([1,2,3,4,5])
sol=Solution()
reversed_head=sol.reverseList(head)
print(linkedListToList(reversed_head))

