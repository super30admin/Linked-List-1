# Time Complexity O(n) n is the number of elements in linked list
# Space complexity O(1)

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:

        slowPtr = head
        fastPtr = head

        while fastPtr and fastPtr.next:
            slowPtr = slowPtr.next
            fastPtr = fastPtr.next.next

            if slowPtr == fastPtr:
                break
        slowPtr = head
        if fastPtr and fastPtr.next:
            while (fastPtr != slowPtr):
                slowPtr = slowPtr.next
                fastPtr = fastPtr.next
        else:
            return None

        return slowPtr
