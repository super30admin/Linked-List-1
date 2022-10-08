# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


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
        #2-pass solution
        #count the length
#         length = 0
#         currentNode = head
#         while currentNode is not None:
#             length+=1
#             currentNode = currentNode.next
            
#         if length-n == 0:
#             head = head.next          
#             return head
    
#         index = 0
#         currentNode = head
#         while index < (length-n-1):            
#             currentNode = currentNode.next
#             index+=1
            
#         currentNode.next = currentNode.next.next
        
#         return head

        dummy = ListNode(0, head)
        left = dummy
        right = head
        
        while n>0:
            right = right.next
            n-=1
            
        while right:
            left = left.next
            right = right.next
            
        left.next = left.next.next
        return dummy.next
                