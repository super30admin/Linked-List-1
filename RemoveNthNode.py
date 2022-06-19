#TC:O(n)
#SC:O(1)
# Definition for singly-linked list.

class ListNode(object):
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        const=0
        dummy=ListNode(-1)
        dummy.next=head
        slow=fast=dummy
        while(const<=n):
            fast=fast.next
            const+=1
        while(fast!=None):
            fast=fast.next
            slow=slow.next
        slow.next=slow.next.next
        return dummy.next
        