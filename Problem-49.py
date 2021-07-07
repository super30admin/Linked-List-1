# Leet code - Remove nth node from the end of a linked list -19
# Time complexity -O(N) (single pass)
#space complexity-O(1) 
# Approach - First we have two pointers one is slow and another one is fast pointer. Fast pointer step increment is equal to n.whereas slow pointer points to next element. It's a two pointers approach.



# Definition for singly-linked list.
 class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # edge case 
        if head ==None : return None
        
        dummy=ListNode(0)
        dummy.next=head
        fast=slow=dummy
        count=0
        
        while count<=n: # here we are incrementing step size of fast pointer equal to n
            fast=fast.next
            count=count+1
        while (fast!= None):
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return dummy.next