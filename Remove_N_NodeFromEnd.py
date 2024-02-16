# Time Complexity O(n) n is the number of elements in linked list
# Space complexity O(1)

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        aheadPtr = head
        slowPtr = head
        count = 0
        while aheadPtr:
            if count <= n:
                aheadPtr = aheadPtr.next
                if aheadPtr == None and count < n:
                    return head.next
                count += 1

            else:
                aheadPtr = aheadPtr.next
                slowPtr = slowPtr.next

        slowPtr.next = slowPtr.next.next
        return head
