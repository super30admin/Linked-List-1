"""
Problem: 19. Remove Nth Node From End of List
Leetcode:https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Solution: Two traversal of the list,
    - first to calculate list length L and
    - second to find the (L - n)th node.
Time Complexity: O(L), L is length of the list
Space Complexity: O(1), constant space used
"""


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # Assign dummy node before head node - helps with list with one node or removing head node
        dummy = ListNode(0)
        dummy.next = head
        first = head
        length = 0

        # find the length of list
        while first is not None:
            length += 1
            first = first.next
        length -= n

        # Move first to the node before n'th node
        first = dummy
        while length > 0:
            length -= 1
            first = first.next

        # remove the n'th node
        first.next = first.next.next

        # since dummy points to the node before head
        return dummy.next