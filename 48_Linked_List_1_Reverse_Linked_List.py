#Time Complexity : O(n) where n is the number of elements
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : 
#Your code here along with comments explaining your approach

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
        prev=None
        next=None
        cur=head
        while cur!=None:
            next=cur.next
            cur.next=prev
            prev=cur
            cur=next
        return prev    
            