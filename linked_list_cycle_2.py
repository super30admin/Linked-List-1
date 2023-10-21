# TC - O(n)
# SC - O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if (slow.val == fast.val):
                break
        else:
            # No cycle detected
            return None

        # Step 2: Find the start of the cycle
        # Start of the cycle by resetting one of the pointers to the head of the list and then moving both pointers one step at a time until they meet again.
        fast = head
        while fast != slow:
            fast = fast.next
            slow = slow.next
        
        return fast

