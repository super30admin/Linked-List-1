# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# TC SC - O(n), O(n)
class Solution:
    def detectCycle(self, head: Optional[ListNode]):
        curr = head
        nodes = set()
        
        while curr:
            if curr in nodes:  # Cycle detected
                return curr  # Return the node where the cycle begins
            nodes.add(curr)  # Add current node to the visited set
            curr = curr.next
        return None  # No cycle detectedreturn -1        
        