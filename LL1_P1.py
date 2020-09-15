Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList_Iteration(self, head: ListNode) -> ListNode:

        prev = None
        curr = head

        while curr:

            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        self.head = prev

        return  prev

    def reverseList_Recursion(self, head: ListNode):

        def _recursion(curr, prev):

            prev = None
            curr = head

            if not curr:
                return prev

            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
            return _recursion(curr, prev)

        head = _recursion(curr = head, prev = None)


"""
Time Complexity : O(n)
Space: O(1)

""""""

1) Take two pointers, keep track of the previous seen elements, and swap with the curr and curr.next.

"""
