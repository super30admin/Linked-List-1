# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        slow = head
        fast = head
        found=False
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                found=True
                break
        # slow and fast will always meet within the first cycle
        if not found:
            return None
        
        pointer = head
        while pointer != slow:
            pointer = pointer.next
            slow = slow.next
        
        return pointer
        

# O(n) time, O(1) space