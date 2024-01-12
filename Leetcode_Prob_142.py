# Problem: Linked List Cycle II
# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach: Used Floyd's Tortoise and Hare algorithm to find the meeting point.


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
        def findMeetingPoint(head):
            slow = head
            fast = head

            while fast and fast.next:
                slow = slow.next
                fast = fast.next.next

                if slow == fast:
                    return slow  # Meeting point found

            return None  # No cycle

        meeting_point = findMeetingPoint(head)

        if not meeting_point:
            return None  # No cycle
        ptr1 = head
        ptr2 = meeting_point

        while ptr1 != ptr2:
            ptr1 = ptr1.next
            ptr2 = ptr2.next

        return ptr1