# Time Complexity: O(n) -> for both recursive and iterative
# Space Complexity: O(1) -> iterative O(n) -> recursive
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        curr = head
        prev = None
        
        while curr!=None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
            
        return prev


#         if not head or not head.next:
#             return head
        
#         node = self.reverseList(head.next)
#         print(head.val)
#         print(node.val)
#         head.next.next = head
#         head.next = None
        
#         return node