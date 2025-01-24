# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # TC : O(n)
        # SC : O(1)
        if head is None:
            return None
        prev,cur = None,head
        fast = cur.next
        while(fast is not None):
            cur.next = prev
            prev = cur
            cur = fast
            fast = fast.next
        cur.next = prev
        return cur