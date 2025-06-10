"""
Problem: Linked List Cycle II
Approach: use a slow and fast pointer running at 1x and 2x speeds to detect cycle. and have a pointer at head and let both head 
and slow move until they meet. the node where they meet is the node where the cycle starts.
t.c. => O(n)
s.c. => O(1)
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break

        if not fast or not fast.next:
            return None
        
        pointer = head
        numPHops = 0
        while pointer != slow:
            pointer = pointer.next
            numPHops += 1
        
        while head != slow:
            head = head.next
            slow = slow.next
        return slow
