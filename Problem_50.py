# TC: O(n)
# SC: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head

        prev = None
        ptr = head
        while ptr:
            tmp = ptr.next
            ptr.next = prev
            prev = ptr
            ptr = tmp

        return prev
