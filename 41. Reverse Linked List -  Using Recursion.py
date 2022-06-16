# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        reverse = self.reverseList(head.next)
        # print(head.val)

        head.next.next = head
        head.next = None
        # print(reverse.val, "Reverse Value", reverse)
        return reverse


# TC = O(n) we traverse all the elements of linkedlist once. Single pass
# Space complexity : O(1). Constant. No extra space used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
