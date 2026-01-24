# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if not head:
            return None

        slow = fast = head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                slow = head #cycle detected so point to head
                while slow and fast:
                    if slow == fast:
                        return slow
                    slow = slow.next
                    fast = fast.next

        return None

# Time Compexity: O(N)
# Space Complexity: O(1)