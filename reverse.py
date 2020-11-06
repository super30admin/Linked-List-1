# // Time Complexity : O(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
# using three pointers to iterate throught list


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if head == None:
            return None
        
        if head.next == None:
            return head
        
        prev = (None)
        cur = head
        nex = (None)
        
        while(cur != None and cur.next != None):
            
            nex = cur.next
            cur.next = prev
            prev = cur
            cur = nex
        nex.next = prev
        return nex