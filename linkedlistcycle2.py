# Time Complexity: O(n)
# Space Complexity: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None

        slow = head
        fast = head
        flag = False

        while fast.next is not None and fast.next.next is not None:  # two pointer approach to find if its cyclic
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break

        if not flag:
            return None

        fast = head

        while slow != fast:  # move both pointers at 1 step a time to check where they meet which would be the cyclic position
            slow = slow.next
            fast = fast.next

        return fast