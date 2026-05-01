# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Time Complexity --> O(n)
# Space Complexity --> O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break
        
        if fast is None or fast.next is None:
            return None
        fast = head
        while slow!=fast:
            slow = slow.next
            fast = fast.next
        return slow 
