# Time Complexity: O(n)
# Space Complexity: O(1)

# The code successfully ran on Leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None: return None
        
        prev, current, fast = None, head, head.next
        
        while fast:
            current.next = prev
            prev = current
            current = fast
            fast = fast.next
            
        current.next = prev
            
        return current
            