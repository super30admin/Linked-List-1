"""
Problem: 142. Linked List Cycle II
Leetcode: https://leetcode.com/problems/linked-list-cycle-ii/
Solution: Using Hashset
Time Complexity: O(n), n is number of nodes visited for both cyclic and acyclic lists
Space Complexity: O(n), for storing each node in hashset
"""


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        visited = set()

        node = head

        while node is not None:
            # if cyclic
            if node in visited:
                return node
            else:
                # add visited nodes to hashset
                visited.add(node)
                node = node.next
        # if not cyclic
        return None
