# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head

        prev = None
        curr = head
        fast = head.next

        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next = prev
        return curr

    # Using 3 pointer
# TC = O(n).
# Space complexity : O(1). Constant. No extra space used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
