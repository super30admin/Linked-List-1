# TC: O(n)
# SC: O(1)
# 1 pass algorithm using the dummy node. Dummy node helps handle edge case of last node removal.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(-1)
        dummy.next = head
        slow = fast = dummy
        count = 0
        # traverse till fast reaches one node prev to node to be removed
        while count <=n:
            fast = fast.next
            count += 1
        # traverse fast till None
        while fast != None:
            slow = slow.next
            fast = fast.next
        # remove node by removing connection
        slow.next = slow.next.next
        return dummy.next