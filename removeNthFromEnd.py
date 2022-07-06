# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length = n
        dummy = ListNode()
        toRem = dummy
        dummy.next = head
        curr = dummy.next
        while curr:
            if length == 0:
                toRem = toRem.next
            else:
                length -= 1
            curr = curr.next
        if toRem.next != None:
            toRem.next = toRem.next.next
        else:
            toRem.next = None
        return dummy.next
