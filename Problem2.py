#time complexity:0(n)
#space complexity :0(1)

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(-1)
        dummy.next = head
        
        count = 0
        slow = dummy
        fast = dummy
        while count < n:
            fast = fast.next
            count = count + 1
            
        
        while fast.next is not None:
            slow = slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        
        return dummy.next
            
        
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        