#Remove Nth Node From End of List

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(0, head)
        slow = fast = dummy

        # Move fast ahead by n+1 steps
        for _ in range(n + 1):
            fast = fast.next

        # Move both slow and fast until fast reaches the end
        while fast:
            slow = slow.next
            fast = fast.next

        # Remove the nth node from the end
        slow.next = slow.next.next

        return dummy.next  
 #time = O(n)
#Space = O(1)