class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:

        if not head:
            return

        temp=head
        l=0
        while(temp):
            l+=1
            temp=temp.next

        if l==1:
            return


        i=0
        cur=head
        prev=None
        while(i<l-n):
            prev=cur
            cur=cur.next
            i+=1
        if prev:
            prev.next =cur.next
            del(cur)
            return head
        else:
            prev=cur
            return prev.next
