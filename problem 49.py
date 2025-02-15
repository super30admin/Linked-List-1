# https://leetcode.com/problems/reverse-linked-list/

# Time Complexity :  O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        prev = (None)
        curr = (head)

        while curr :
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev

        