#Time Complexity : O(n)
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to use Floyd's algorithm to detect the cycle by maintaining slow and fast pointers with fast pointer jumping at 2x speed. Once the cycle is detected, the beginning of the cycle could be found by traversing the slow fro head and fast from the current position until they meet each other.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        check = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                check = True
                break

        if not check:
            return None

        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
