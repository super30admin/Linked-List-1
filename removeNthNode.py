"""
TC - O(n)
SC - O(1)
"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None or head.next is None: return None

        # create a dummy node and place it before head
        # Dummy node is create for a special case -
        # if we are asked to delete the last node
        dummy = ListNode()
        dummy.next = head

        # set two pointers at dummy
        slow = dummy
        fast = dummy

        count = 0

        # increment fast pointer
        while count <= n:
            fast = fast.next
            count += 1

        while fast is not None:
            fast = fast.next
            slow = slow.next

        # delete the node
        slow.next = slow.next.next

        # return head
        return dummy.next