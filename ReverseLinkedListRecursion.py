# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    '''Time Complexity: O(n)
    Space Complexity: O(n) ----Recursion stack'''
    #Using recursion
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #No need to reverse
        if head is None or head.next is None:
            return head
        
        reverse=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return reverse
        
        
