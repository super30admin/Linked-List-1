# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy

        count = 0
        while count <= n:
            fast = fast.next
            count += 1

        while fast is not None:
            slow = slow.next
            fast = fast.next

        # temp=slow.next
        slow.next = slow.next.next
        # temp.next=None

        return dummy.next