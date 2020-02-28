'''
Iterative:
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation : Create 2 pointers one to move the pointer by 1 and fast by 2. Do this until they meet. Once they meet
move both of them at the same time until we find the intersection node.
'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head is None:
            return None

        slow = head
        fast = head

        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next

            # cycle
            if slow == fast:
                # detect the intersection
                slow = head

                while slow != fast:
                    slow = slow.next
                    fast = fast.next

                return slow

        return None

