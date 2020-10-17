# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
"""
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        if head is None:
            return head
                
        curr = slow = fast = head
        temp = None
        while(fast and fast.next):
            fast = fast.next.next
            slow = slow.next
            
            if(slow == fast):
                temp = slow
                break
                
        if temp is None:
            return None
        
        while(curr != temp):
            temp = temp.next
            curr = curr.next
            
        return curr