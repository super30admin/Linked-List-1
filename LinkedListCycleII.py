"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        visitedNode = set()
        node = head
        # Mark all the visited nodes till we reach the end of list
        # and store it in a set if we find any node that is already 
        # marked visited in hashset then return the node
        while node != None:
            if node in visitedNode:
                return node
            else:
                visitedNode.add(node)
                node = node.next
        return None