# https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

# Time complexity: O(n) 
# Space complexity: O(1)
# Explanation: Add a dummy node to handle cases of single node. Use two pointers. The first pointer is moved so that it is exactly "n" nodes between first and second pointer.
# Then move both pointers till first reaches the end. At this point second should be at the nth node from the last. Now this can be removed.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        first = dummy
        second = dummy
        for i in range(n + 1):
            first = first.next
        while first:
            first = first.next
            second = second.next
        second.next = second.next.next
        return dummy.next
      
