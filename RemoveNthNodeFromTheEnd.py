# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        '''Time Complexity: O(n)
        Space Complexity: O(1)'''
        #Use 2 pointers such that the fast pointer maintains a gap of n places from the slow 
        
        if head is None:
            return head
        
        dummy=ListNode(None)
        dummy.next=head
        
        s=dummy
        f=dummy
        count=0
        #Move fast pointer to n places to maintain the gap
        while count<=n:
            f=f.next
            count+=1
        #iterate till fast is null
        while f is not None:
            f=f.next
            s=s.next
            
        s.next=s.next.next
        return dummy.next
