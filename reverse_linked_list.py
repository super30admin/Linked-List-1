# // Time Complexity : O(n)
# // Space Complexity : O(n) - due to recursive call stack
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        self.res=None
        def helper(root):
            if root==None or root.next==None:
                self.res=root
                return 
            helper(root.next)
            root.next.next=root
            root.next=None
        
        helper(head)
        return self.res
