# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Using Iterative Approach
# Time Complexity is O(n)
# Space Complexity is O(1)
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return head
        prev = None
        curr = head
        nextt = head.next
        while(nextt):
            
            temp = nextt.next
            nextt.next = curr
            curr.next = prev
            
            prev = curr
            curr = nextt
            nextt = temp
        
        return curr