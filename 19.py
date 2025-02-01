# Time Complexity : O(n)
# Space Compexity : O(1)
# 
#  Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        if head == None:
            return head
        dummy = ListNode(0)
        dummy.next = head
        s = dummy
        f = dummy 
        count = 0
        while count <= n:
            f = f.next
            count = count +1
        while f != None:
            f = f.next
            s = s.next
        s.next = s.next.next
        return dummy.next