# Leetcode 206. Reverse Linked List

# Time Complexity :  O(n) where n is the size of the array

# Space Complexity : O(n) where n is the size of the recurssive stack

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Move head to the last node in the list recurrsively and store it. Once the end is reached
# head points to the last but one element due to recurssive stack pop. Start reversing the next pointers
# of the last node i.e. head.next.next to point to head. Simultaneously delete the previous order next pointer
# return the last element as its the start of the reversed list

# Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # Base case where list is empty or has one node
        if not head or not head.next:
            return head
        # Move head to the last node in the list recurrsively and store it
        last = self.reverseList(head.next)
        # Once the end is reached head points to the last but one element due to
        # recurssive stack pop.
        # start reversing the next pointers of the last node i.e. head.next.next to point to head
        head.next.next = head
        # Simultaneously delete the previous order next pointer
        head.next = None
        # return the last element as its the start of the reversed list
        return last
