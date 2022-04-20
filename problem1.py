'''https://leetcode.com/problems/reverse-linked-list/
'''


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
    def reverseList(self, head: 'Optional[ListNode]') -> 'Optional[ListNode]':
        if head is None or head.next is None: return head
        
        prev = None
        current = head
        nextnode = head.next
        
        while nextnode is not None:
            current.next = prev
            prev = current
            current = nextnode
            nextnode = nextnode.next
        
        # current is at last code
        current.next = prev
        return current
