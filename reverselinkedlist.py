# Time Complexity : O(N)   
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        
        prev = None
        cur = head
        fo = head
        while cur!=None:
            
            head = head.next
            cur.next = prev
            prev = cur
            cur = head
            
        return prev