#TimeComplexity:O(N) 
#SpaceComplexity: O(1)
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        #Using DummyNode
        if head.next==None:
            return None
        dummy=ListNode(-1)
        dummy.next=head
        p1=dummy
        p2=dummy
        for i in range(n):#increment 2nd pointer to n places
            p2=p2.next
        while(p2.next!=None):#increment both p1 and p2 till we reach end
            p1=p1.next
            p2=p2.next
        p1.next=p1.next.next#remove nth element
        #print(head,dummy)
        return dummy.next #dont return head it will raise error if len=n
    
        ''''
        #without length in O(N) time
        if head.next==None:
            return None
        p1=head
        p2=head
        for i in range(n):#increment 2nd pointer to n places
            p2=p2.next
        if p2==None: # If we have to delete initial element then copy the next element and point to 3rd element
            head.val=head.next.val
            head.next=head.next.next
            return head
        while(p2.next!=None):#increment both p1 and p2 till we reach end
            p1=p1.next
            p2=p2.next
        p1.next=p1.next.next#remove nth element
        return head
        '''
        '''
        #Solution using only length in O(2N) time
        length=1
        k=head
        while k.next!=None:#loop for finding length
            length+=1
            k=k.next
        if length==1: #if only one element is present return None
            return None
        length=length-n
        i=1
        if length==0: # If we have to delete initial element then copy the next element and point to 3rd element
            head.val=head.next.val
            head.next=head.next.next
            return head
        k=head
        while i<=length: # to delete from middle
            if i==length:
                k.next=k.next.next
            k=k.next
            i+=1
        return head
        '''