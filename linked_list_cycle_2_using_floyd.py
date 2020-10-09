"""
Problem: 142. Linked List Cycle II
Leetcode: https://leetcode.com/problems/linked-list-cycle-ii/
Solution: Using Floyd's Tortoise and Hare algorithm
Time Complexity: O(n), n is number of nodes visited for both cyclic and acyclic lists
Space Complexity: O(1), it allocates only pointers so constant space
"""


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # Base case
        if head is None or head.next is None:
            return None

        slow = head
        fast = head

        # find if the cycle is present
        # while 2nd last and last element is not None
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            # find the entrance to the cycle
            if slow == fast:
                p1 = head
                while slow != p1:
                    p1 = p1.next
                    slow = slow.next
                return slow
        return None



