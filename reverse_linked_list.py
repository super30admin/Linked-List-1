# Time Complexity: O(n) where n is the number of nodes
# Space Complexity:  O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        prev = None
        curr = head
        next = curr.next
        while(curr.next != None):
            curr.next = prev
            prev = curr
            curr = next
            next = next.next
        curr.next = prev

        return curr
########################################################################
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        return self.helper(head, None)
    def helper(self, head, prev):
        if head == None:
            return prev
        next = head.next
        head.next = prev
        prev = head
        return self.helper(next, prev)

###########################
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        curr = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return curr
