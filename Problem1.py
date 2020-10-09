# Time complexity: O(N)
# Space complexity: O(N)
# Leetcode all test cases passed: Yes
# Any difficulties: No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return head
        p1 = head
        p2 = head.next
        head.next = None
        while p2:
            temp = p2.next
            p2.next = p1
            p1 = p2
            p2 = temp
        return p1
