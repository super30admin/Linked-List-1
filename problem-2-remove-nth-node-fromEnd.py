"""
Problem: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

Approach:

1. take 2 pointers fast and slow
2. make a dummy node which points to head and make the 2 pointers point to the dummy node
3. move the fast pointer by count next
4. move both the pointer untill fast pointer becomes null
5. then point the slow.next to slow.next.next

"""

# Time Complexity : O(N) where N is the length of the list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head==None:
            return None
        
        tempNode = ListNode(99)
        tempNode.next = head
        
        slow = tempNode
        fast = tempNode
        
        count=0
        while(count<n):
            fast = fast.next
            count+=1
        
        while(fast!=None and fast.next!=None):
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        
        return tempNode.next
        