"""
Implemented using a dummy node at the beginning to handle edge cases, and then used the slow and fast pointer approach.
Time Complexity: O(n)
Space Complexity: O(1)
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head or not head.next:
            return None
        dummy = ListNode(-1)
        dummy.next = head
        count = 0
        slow = dummy
        fast = dummy
        while count <= n:
            fast = fast.next
            count += 1
        while fast != None:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        return dummy.next    