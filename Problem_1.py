# https://leetcode.com/problems/reverse-linked-list/description/

# Time complexity: O(n) 
# Space complexity: O(1)
# Explanation: Iterate over the linked list and change the next pointer to point to the previous pointer

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev
