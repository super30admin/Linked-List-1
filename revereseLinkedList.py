# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""
While Traversing the list, we change current node's next pointer to its Previous element.
and we store previous element before changing the reference and return new head
"""
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        curr_node = head
        prev = None
        while(curr_node != None):
            next_node = curr_node.next
            curr_node.next = prev
            prev = curr_node
            curr_node = next_node
        return prev