# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        prev = None
        p1 = head
        p2 = head

        if p1.next == None and n == 1:
            return head.next
        while n > 1 and p2 != None:
            p2 = p2.next
            n-=1
        
        while p2.next != None:
            prev = p1
            p1 = p1.next
            p2 = p2.next
        
        if p1 == head:
            head = head.next
        else:
            prev.next = p1.next
        return head