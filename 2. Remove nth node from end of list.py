# Time Complexity - O(n)
# Space Complexity - O(1)

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head, n: int) :
        dummy = ListNode()
        dummy.next = head

        slow = dummy
        fast = dummy

        # Move forward the fast pointer
        while n > 0:
            fast = fast.next
            n -= 1

        # Start moving both the slow and the fast pointers at once
        while fast.next is not None:
            slow = slow.next
            fast = fast.next

        # Remove the node by updating the pointer
        slow.next = slow.next.next

        return dummy.next

