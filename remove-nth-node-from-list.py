'''
Did it run on leetcode: Yes
Problems faced: Recursion base cases (bottom up approach)

Time Complexity: 0(N)
Space Compleixty: 0(N) recursion stack

Algorithm:
- Go end of the list using recursion stack
- When recursion stack unfolds it returns position from last and pointer itself.
- If position is the req position  we just unlink it and return head.

'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def __init(self,head):
        head = None
    
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        self.head = head
        if(head is None):
            return head
        if(n==0):
            return head
        if(n==1 and (head.next is None)):
            return head.next
        
        i = self.util(head,n)
        return self.head

    def util(self,head,n,prev=None):
        
        if(head is None):
            return 1
        currentPos = self.util(head.next,n,head)
        if(currentPos == n):
            if(prev is None ):
                if(head is None):
                    self.head = None
                else:
                    self.head = head.next
            else:
                prev.next = head.next
        return currentPos+1
        
        