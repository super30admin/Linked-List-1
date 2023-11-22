# // Time Complexity : O(N)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : NO


# // Your code here along with comments explaining your approach
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Initialize an empty hash set
        nodes_seen = set()

        # Start from the head of the linked list
        node = head
        while node is not None:
            # If the current node is in nodes_seen, we have a cycle
            if node in nodes_seen:
                return node
            else:
                # Add this node to nodes_seen and move to the next node
                nodes_seen.add(node)
                node = node.next

        # If we reach a null node, there is no cycle
        return None