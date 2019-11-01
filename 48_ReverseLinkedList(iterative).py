# Accepted in leetcode(206)
# time - O(N), space - O(1)
# Reversing each  pointer in a loop(iteratively),  will eventually reverse the linked list. Check for edge cases.
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # edge case
        if head == None or head.next == None:
            return head
        # defining 3 pointers
        prev = None
        curr = head
        next = head.next
        # iterating through the linked list
        while next is not None:
            # reassigning the pointer
            curr.next = prev
            # reassigning 3 static pointer values.
            prev = curr
            curr = next
            next = next.next
        # to avoid missing the last element
        curr.next = prev

        return curr