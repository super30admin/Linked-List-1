#// Time Complexity : O(n) 
# // Space Complexity : O(1)   
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : Yes getting the fast pointer trick was a bit difficult.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast = head
        slow = head

        for i in range(n):
            print(i)
            fast = fast.next
            
        if not fast:
            return head.next
        # then advance both fast and slow now they are nth postions apart

        while fast.next:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return head


# Approach:
# 1. Create two pointers, fast and slow. Fast pointer will be n steps ahead of slow pointer
# 2. If fast pointer reaches the end of the list, then slow pointer is at the nth node
# and then we can easily remove the node