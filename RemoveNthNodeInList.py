# Time complexity: O(n) { O(2n) for 2 pass algo}
# Space complexity: O(1)

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head, n):
        if not head:
            return head
        # pass 1: get the length
        length = 0
        cur = head
        while cur:
            length += 1
            cur = cur.next
        # use dummy node to make deletion at head easier
        dummy = ListNode("sentinel")
        dummy.next = head
        cur = dummy
        i = 0
        # pass 2: to delete the node
        while cur.next and i < (length-n):
            cur = cur.next
            i += 1
        cur.next = cur.next.next
        return dummy.next
