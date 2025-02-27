"""

## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
"""
# TC : O(n)
# SC: O(1)

# Approach 1: two pass 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None: return None
        size = 0
        curr = head

        #first pass to determine the size of the linked list
        while curr:
            size += 1
            curr = curr.next
        
        targetIndex = size - n
    
        # handle edge case 
        if targetIndex == 0:
            head = head.next

        curr = head
        prev = None
        # Second pass 
        while targetIndex > 0:
            prev = curr
            curr = curr.next
            targetIndex -= 1

        if prev:
            prev.next = curr.next

        return head


            

# Approach 2 : single pass

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        if head is None : return None 

        curr = fast = head
        targetSize = 0

        while targetSize < n and fast:
            fast = fast.next
            targetSize += 1

        if fast is None:
            head = head.next

        prev = None
        while fast:
            fast = fast.next
            prev = curr
            curr = curr.next

        if prev:
            prev.next = curr.next 

        return head
        