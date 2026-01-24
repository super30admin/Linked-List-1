# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummy = ListNode() #we create a dummy node because if we want to delete head, we need to land in the node previous to head

        dummy.next = head
        slow = dummy
        fast = dummy

        for _ in range(n+1):
            fast = fast.next

        #we keep fast at n+1 node from dummy node so that
        #when we start moving slow and fast together, slow will land at prev node to be deleted
        #and fast will be at None
        #derivation see below

        while fast:
            slow = slow.next
            fast = fast.next

        #after this step fast will be at None and slow will be at the node previous to the node to be deleted.

        slow.next = slow.next.next

        return dummy.next
    
# Time: O(N)
# Space: O(1)

# dummy -> 1 -> 2 -> 3 -> 4 -> 5 -> None
#   -1.    0.   1.   2.   3    4.   5

# node to be deleted is n=2 which is second node from last, index = 3, i.e index = l-n
# slow and fast at -1 index first
# we need slow to be at l-n-1 node which is prev_node = l-n-1
# we need to move fast 'k' steps first from dummy node. so it will be at k-1 index
# then we need to move slow and fast together 't' steps

# for slow pointer = -1 + t = l-n-1
#                         t = l-n

# for fast pointer = k-1+t = l index which is None
#                        t = l-k+1

#             l-n = l-k+1
#              -n = -k+1
#              k = n+1

# which means first move fast pointer 'k' steps from dummy node so that slow pointer will be at prev_node when fast pointer reaches None. so we can delete l-n node successfully.