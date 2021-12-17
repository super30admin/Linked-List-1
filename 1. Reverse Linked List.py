# Time Complexity - O(n)
# Space Complexity - O(1)

# Approach : Traverse through the linked list and keep reversing the pointers till the end.

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head) :
        if head is None or head.next is None:
            return head

        prev = None
        curr = head
        fast = head.next

        while fast:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next = prev
        return curr