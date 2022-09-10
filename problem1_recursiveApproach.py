"""
Time Complexity : O(n) where n is the number of nodes in the Linked List.
Space Complexity : O(n) space required for recursive stack
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
We need to reverse the Linked List that means each of the node should point to its previous node.
This problem can be solved using Recusrion as well.
Push the Nodes to the recursive stack and when reached the last node pop operation will take place at that time update the next pointets.
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Edge case if Linklist is None or Linklist has only one member then return head
        if head == None or head.next == None:
            return head
        
        newHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        
        return newHead