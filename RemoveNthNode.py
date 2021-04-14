# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Using Slow and Fast pointers, fast pointer is moved until slow-fast is n and then both are moved to delete a node
# Time Complexity is O(n)
# Space complexity is O(1)
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dum = ListNode(-1)
        dum.next = head
        fast = dum
        slow = dum
        
        while(fast.next):
            if(n <= 0):
                slow = slow.next
            fast = fast.next
            n-=1
        slow.next = slow.next.next
        return dum.next