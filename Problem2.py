# Time Complexity : O(n) where n is the number of elements in the linked list
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this :


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head, n):
        lst1 = lst2 = head
        for i in range(n):
            lst1 = lst1.next
        if not lst1:
            return head.next
        while lst1.next:
            lst1 = lst1.next
            lst2 = lst2.next

        lst2.next = lst2.next.next
        return head