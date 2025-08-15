# https://leetcode.com/problems/remove-nth-node-from-end-of-list/
# Remove Nth Node From End of List
# Time complexity: O(n)
# Space complexity: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast, slow = head, head
        dummy = ListNode(-1) # Dummy node to handle edge cases
        dummy.next = head
        slow,fast = dummy,dummy
        for _ in range(n): # Move fast pointer n steps ahead to create a gap 
            fast = fast.next
        while fast.next: # Move both pointers until fast reaches the end and slow is at the node before the one to remove
            slow,fast = slow.next, fast.next
        slow.next = slow.next.next # Removes the nth node from the end
        return dummy.next
        