# Time Complexity : O(N) 
# Space Complexity :    O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head ==None:
            return
        
        prev=None
        curr = head
        fast = head.next
        while(fast!=None):
            curr.next=prev
            prev=curr
            curr=fast
            fast = curr.next
        curr.next=prev
        return curr