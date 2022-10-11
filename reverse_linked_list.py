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
            return None
        if head.next is None:
            return head
        prev = None
        current = head
        fast = head.next

        while fast is not None:
            current.next = prev
            prev = current
            current = fast
            fast = fast.next
        
        current.next = prev

        return current

