# Time complexity is O(1) and space complexity is O(1)
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
        
        slow = head
        fast = head
        
        for i in range(n):
            fast = fast.next
        
        while fast==None:
            return head.next
        
        while fast.next!=None:
            slow=slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        
        return head