'''
Approach: for each node, store next node, point from current node to previous node, store current node in previous variable and update current to next node.

Time: O(n)
Space: O(1)

Passes all testcases in leetcode

'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        curr = head  
        prev = None
        
        if curr == None or curr.next==None: 
            return head
        
        while(curr):
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node
        return prev
        
