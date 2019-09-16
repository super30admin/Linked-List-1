# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        p=head
        len=0
        i=0
        while(p!=None):
            len+=1
            p=p.next
            print(len)
            a=len-n+1
        if(a==1):
            return head.next
        p=head
        while(p!=None):
            i+=1
            if(i==a-1):
                p.next=p.next.next
            p=p.next
        return head
