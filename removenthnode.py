"""

First we move the fast pointer n + 1 steps ahead so it leads the slow by n nodes.
Then we walk both together until fast hits the end — now slow is right before the target.
Finally, we skip the node to be removed and clean up the reference.

"""
#Time Complexity:O(N)
#Space Complexity: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        count = 0
        slow = dummy
        fast = dummy
        while count <=n:
            fast = fast.next
            count+=1

        while fast:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        #slow.next = slow.next.next
        return dummy.next
        