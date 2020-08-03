class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        count=0
        dummy=ListNode()
        dummy.next=head
        if head.next==None or head==None:
            return None
        Temp=head
        while Temp!=None:
            count+=1
            Temp=Temp.next
        Temp=dummy
        count-=n
        while count>0:
            Temp=Temp.next
            count-=1
        Temp.next=Temp.next.next
        return dummy.next

#Time-Complexity: O(L)
#Space-Complexity: O(1)