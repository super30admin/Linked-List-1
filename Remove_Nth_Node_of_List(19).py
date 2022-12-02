# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# The idea is to use a fast and a slow pointer to create a gap of 'n'(the nth place to be deleted)
# between the pointers , so that when fast reaches the end we are at the 'nth' last node.
# Slow would be at one place before the required node and we would change the next of it to next.next
# we use a dummy node here so that if the first element needs to be deleted, it wouldn't throw an error
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head==None or head.next==None:
            return None
        dummy = ListNode(val=None,next=head)
        slow = dummy
        fast = dummy
        count = 0
        while count<=n:
            fast = fast.next
            count+=1
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
