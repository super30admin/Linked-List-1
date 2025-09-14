# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

"""
Time Complexity: O(N) -> We traverse through the list, and just keep changing the links
Space Complexity: O(1) -> We only use two pointers, and a temp node, no extra memory
Explanation: At each step, we use curr and prev pointers, where prev is one step behind the curr pointer, and we use curr to point to previous to actually reverse the node, but to assign current to the next node, we use a temp node where we store the node and update curr to temp and prev to curr as we go"""


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        prev, curr = None, head

        while curr: 
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev
