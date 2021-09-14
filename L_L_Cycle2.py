# TC : O(n)
# SC : O(1)
# Approacch to slove this problem:

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None                 # Declared prev
        while head:                 # Termination state while list
            temp = head             # assigned value to temp
            head = head.next        # Assigned head to the next node
            temp.next = prev        # Changed the pointer 
            prev = temp             # Changed prev to one step
        return prev