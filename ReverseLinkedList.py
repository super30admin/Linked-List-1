"""
//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""
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
        if head == None :
            return None
        
        curr = head
        prev = None
        fast = curr.next
        while(fast!= None):
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr
        # T. C  = O(n)
        # S.C  = O(1)
        # prev=None
        # curr=head
        # while(curr!=None):
        #     Next=curr.next
        #     curr.next=prev
        #     prev=curr
        #     curr=Next
        # return prev