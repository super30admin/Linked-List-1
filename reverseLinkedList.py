"""

So, we just walk through the list one node at a time.
At each step, we flip the direction of the pointer to the previous node.
And finally, we return the last node as the new head of the list.

"""
#Time Complexity: O(N)
#Space Complexity: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        
        while(curr):
            tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp

        return prev