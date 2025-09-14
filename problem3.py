# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
"""
Space Complexity: O(N)

Time Complexity: O(N)
"""

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        flag = False
        slow = fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break

        if flag == False: 
            return None

        slow = head
        while slow != fast: 
            slow = slow.next
            fast = fast.next

        return slow
