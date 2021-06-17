# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#using three pointers to iterate

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None:
            return head
        if head.next == None:
            return head
        v1 = head
        v2 = head.next
        v3 = head.next.next
        while v3 != None:
            v2.next = v1
            if v1 == head:
                v1.next = None
            v1 = v2
            v2 = v3
            v3 = v3.next
        if v1 == head:
            v1.next = None
        v2.next = v1
        x = v2
        return v2

