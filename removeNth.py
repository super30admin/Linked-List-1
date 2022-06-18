"""Approach 1:
2 passes - use 1st pass to count len of linked list and validate that n is not greater than len.
Then in 2nd pass move pointer till n-1th location and do n-1.next = n-1.next.next
that way node is considered deleted.
But handle edge case where pos is 0 that means we need to remove the first element,
just move head = head.next in that case.
Return head.

TC O(n) - we traverse list twice but still linear time
SC O(1) no extra space used
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return
        # find len of linkedlist
        p = head
        c = 0
        while p:
            p = p.next
            c += 1
            
        # if count is smaller than n, return
        if n > c:
            return
        # set position to count - n
        pos = c - n
        
        # reset p to head
        p = head
        # while position is >1, do pos-=1 and move p to next
        # at the end of loop p should be at n-1th index
        while pos > 1:
            p = p.next
            pos -=1
        
        # if pos is 0 that means we need to remove the first element. so just move head to next
        if pos == 0:
            head = head.next
        # else make n-1.next to point to n-1.next.next
        # this way node is considered deleted
        elif p and p.next:
            p.next = p.next.next
        
        # return head
        return head