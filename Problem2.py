# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    # Time Complexity:O(n)
    # Space Complexity:No space
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        dummy = ListNode(0)
        dummy.next = head
        slow = dummy
        fast = head
        while count < n and fast:
            fast = fast.next
            count += 1
        while fast is not None:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        return dummy.next
