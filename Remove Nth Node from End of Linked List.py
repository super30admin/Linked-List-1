# Time: O(n)
# Space: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head.next:
            return
        dummy = ListNode(None, head)
        slow = dummy
        fast = dummy
        count = n
        while count:
            fast = fast.next
            count -= 1
        # print("Fast", fast)

        while fast and fast.next:
            slow = slow.next
            fast = fast.next
        # print(slow)
        slow.next = slow.next.next
        if slow == dummy:
            return slow.next
        return head