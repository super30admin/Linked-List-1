# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def reverseList(self, head, prev=None):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # Iterative
        # curr = head
        # prev = None
        # while curr != None:
        #     temp = curr.next
        #     curr.next = prev
        #     prev = curr
        #     curr = temp
        # return (prev)
    
        # Recursive
        curr = head
        if curr != None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
            return self.reverseList(curr, prev)
