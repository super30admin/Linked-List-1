# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Approach:
          Visit each node, and keep track of this "seen" node in a hash set.

		Time Complexity: O(n) - visit each node in the list in the worst case
        Space Complexity: O(n) - use a hash set
        Did this code successfully run on Leetcode: Yes
    
        Any problem you faced while coding this: No

        """
        nodes_seen = set() # Create an empty set using the constructor. Using {} creates an empty dictionary

        curr: ListNode = head
        while curr:
            if curr not in nodes_seen:
                nodes_seen.add(curr)
            else:
                return curr
            curr = curr.next

        # We have reached the end, and there is no cycle
        return None
