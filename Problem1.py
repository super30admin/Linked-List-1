# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    # Iterative solution
    # Time Complexity:O(n)
    # Space Complexity: No space
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        prev = None
        curr = head
        temp = head.next
        while temp is not None:
            curr.next = prev
            prev = curr
            curr = temp
            temp = temp.next
        curr.next = prev
        return curr

    # Recursive solution
    # Time Complexity:O(n)
    # Space Complexity:O(n)
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head

        rest = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return rest
