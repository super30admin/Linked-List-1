# Time Complexity : O(N)  //Where n is the size of the list we are iterating
#  Space Complexity : O(1)  //We are not using any extra space
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return head
        dummy = ListNode(0)
        dummy.next = head
        first = dummy
        second = dummy
        #We are moving first upto Nth Node
        for i in range(n+1):
            first = first.next
        while first:
            first = first.next
            second = second.next  # second points the Before the Nth Node
        second.next = second.next.next # updating second pointer which skips Nth node
        return dummy.next  # retuens head
            