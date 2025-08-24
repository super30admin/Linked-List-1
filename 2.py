'''
Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]: # type: ignore
        if head == None:
            return None

        dummy = ListNode(-1) # type: ignore
        dummy.next = head
        count = 0
        slow = dummy
        fast = dummy

        while count <= n:
            fast = fast.next
            count += 1

        while fast != None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next
        return dummy.next            