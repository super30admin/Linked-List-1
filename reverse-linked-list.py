# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach:
# Iteratively reverse the Linked list. maintain 3 pointers, previous, current and next.
# Iterate over the list using the current pointer. During every iteration, point current.next to previous and use next to temporarily store a reference to current.next node. 
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None
        
        prev, next = None, None
        current = head
        
        while current:
            next = current.next
            current.next = prev
            prev = current
            current = next
        return prev
    
# Recursive Approach
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next:
            return head
        rev = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return rev
