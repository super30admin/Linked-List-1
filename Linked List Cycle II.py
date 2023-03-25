# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Brute force approach
        # Time: O(n)
        # Space: O(n) used by hashset
        # hashset = set()
        # node = head
        # while node:
        #     if node in hashset:
        #         return node
        #     hashset.add(node)
        #     node = node.next

        # Optimised Approach
        # Time: O(n)
        # Space: O(1)
        if not head:
            return
        slow, fast = head, head
        flag = False
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if flag:
            slow = head
            while slow != fast:
                slow = slow.next
                fast = fast.next
            return fast