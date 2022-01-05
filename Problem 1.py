# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time: O(n)
# Space: O(n) Recursive stack
class Solution(object):
    def __init__(self):
        self.head = None
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None:
            return head
        self.helper(None, head)
        return self.head
    def helper(self, prev, curr):
        if curr.next == None:
            self.head = curr
            return curr
        nxt = self.helper(curr, curr.next)
        nxt.next = curr
        curr.next = prev
        return curr
        
            
        
        
