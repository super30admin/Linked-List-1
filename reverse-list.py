# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

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
        #iterative approach
        
        prev = None #setting prev to none a dummy node
        curr = head #setting current as head
        
        while curr:
            next_node = curr.next # remember next node
            curr.next = prev  # reverse the order
            prev = curr  # used in for the next iteration.
            curr = next_node  # move to next node.
            
        head = prev
        return head