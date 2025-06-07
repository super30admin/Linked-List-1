'''
Given the head of a singly linked list, reverse the list, and return the reversed list.
'''
# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no


# Solution : we use 3 pointers: curr, prev & temp to hold next node.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None

        # while head:
        #     temp = head.next
        #     head.next = prev
        #     prev = head
        #     head = temp
        
        # return prev
        return self.helper(head, prev)

    def helper(self, head, prev):
            # Base case
            if not head: return prev
            # Recursive logic
            temp = head.next
            head.next = prev
            prev = head
            head = temp
            return self.helper(head, prev)
