"""
Problem: 206. Reverse Linked List
Leetcode: https://leetcode.com/problems/reverse-linked-list/
Example:
    - Input: 1->2->3->4->5->NULL
    - Output: 5->4->3->2->1->NULL
Solution: Use temp pointer to store the link before replacing it
Time Complexity: O(n), iterated the whole list of length n
Space Complexity: O(1), three pointers are used
"""


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # Assign two pointers
        prev = None
        curr = head

        # Iterate through the list till curr is None
        while curr is not None:
            # assign extra pointer to store curr's next node
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        # since curr will be None, return prev
        return prev

