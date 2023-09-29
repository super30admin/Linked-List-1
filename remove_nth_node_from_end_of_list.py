# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Time Complexity: O(n) where n is the number of nodes
# Space Complexity:  O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1) # dummy node as we might have to delete the node at head
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while(count < n):
            count += 1
            fast = fast.next
        
        while(fast.next != None):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
