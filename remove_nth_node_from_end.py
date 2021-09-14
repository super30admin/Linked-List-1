# // Time Complexity : O(n) where n stand for length of the list
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach 
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        m = 0
        cur = head
        while cur:
            m += 1
            cur = cur.next
            
        m = m - n
        
        if m < 1: return head.next
        
        prev = None
        cur = head
        while m and cur:
            prev = cur
            cur = cur.next
            m -= 1
        if prev and cur:
            prev.next = cur.next
        return head