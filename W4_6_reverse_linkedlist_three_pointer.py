# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Time complexity: O(N), we visit all nodes with curr exactly once. 
# Space complexity: O(1), we just use a few extra pointers (prev, curr, temp)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        while curr != None:
            temp = curr.next # Store curr.next before overiding.
            curr.next = prev 
            prev = curr
            curr = temp # Moving curr to the next node to process

        return prev

