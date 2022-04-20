'''https://leetcode.com/problems/remove-nth-node-from-end-of-list/'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def removeNthFromEnd(self, head: 'Optional[ListNode]', n: int) -> 'Optional[ListNode]':
        cnt = 0
        dummy = ListNode(-1)
        dummy.next = head        
        left = dummy
        right = dummy
        
        while cnt <= n:
            right = right.next
            cnt += 1
        
        while right is not None:
            left = left.next
            right = right.next
        
        left.next = left.next.next
        
        return dummy.next
            
        
        
        