# Time Complexity : O(n) where n is the number of nodes
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# we create two pointers slow and fast
# move the fast to n
# till fast reach the last node, increase fast and slow by one node
# At the end slow.next is the target value to removed
# we point slow.next to slow.next.next

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:

        slowP = fastP = head

        while n > 0 and fastP.next is not None:
            fastP = fastP.next

            n -= 1

        if n > 1: return None
        if n == 1: return head.next

        while fastP.next is not None:
            slowP = slowP.next
            fastP = fastP.next

        slowP.next = slowP.next.next

        return head

