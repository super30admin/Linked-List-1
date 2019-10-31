#Time Complexity:O(n)
#Space Complexity:O(1)
#leetcode submission:succesful
#use of fast and slow pointer 
#the fast pointer is n postion forward

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        temp2=head
        temp1=head
        while(n>0):
            temp2=temp2.next
            n=n-1
        if not temp2:
            return head.next
        while(temp2.next!=None):
            temp2=temp2.next
            temp1=temp1.next
        temp1.next=temp1.next.next
        return head