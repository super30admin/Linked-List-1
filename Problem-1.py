# 206. Reverse Linked List
'''
Leetcode all test cases passed: Yes
Solution:
    def reverseList(self, head):
        n is the no of nodes in the linked list
        Space Complexity: O(n)
        Time Complexity: O(n)
'''
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        if not head:
            return None
        
        newCurr = head
        if head.next:
            newCurr = self.reverseList(head.next)
            head.next.next = head
        
        head.next = None
        
        return newCurr
        
