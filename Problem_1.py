

# 206. Reverse Linked List

# Code: Approach : Change pointers!!!!

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        curr = head
        nxt = None
        prev = None
        
        
        while curr:
            nxt = curr.next
            curr.next = prev 
            prev = curr
            curr = nxt
        
        return prev


# Time complexity: O(n) 
# Space complexity: O(1)
# Accepted on Leetcode: Yes.