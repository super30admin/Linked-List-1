# Problem1 (https://leetcode.com/problems/reverse-linked-list/)
# Time Complexity: O(n), we visit every node exactly once
# Space Complexity: O(1), only a few pointers used, no extra data structures
# Approach: Walk through the list one node at a time. For each node, beforebreaking its forward link, save where the rest of the list continues. 
#Then flip that node's pointer to point BACKWARD instead of forward. 
#Move both pointers ahead by one and repeat until every node has been flipped.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        previous = None        # will track the node that comes before "current" in the REVERSED list.starts as None because the very first node
        # we flip (the original head) should end up pointing to nothing
        current = head         # the node we are currently working on, starts at the original head

        while current is not None: # keep looping until current falls off the end of the list (becomes None),that means every node has been flipped already

            temperory = current.next   # save where the list continues BEFORE we break the link.
                                        # example: if current is node 1, and 1 -> 2 -> 3 -> 4 -> 5,
                                        # then temperory = 2. without saving this first, we'd lose
                                        # our way to the rest of the list the moment we rewire current.next

            current.next = previous    # flip current's arrow to point backward to "previous"
                                        # instead of forward. example: 1.next was pointing to 2,
                                        # now it's rewired to point to None (since previous = None
                                        # on the first pass). this is the actual "reversal" step

            previous = current         # current has now been fully flipped, so it becomes the new
                                        # "previous" for the next node we process.
                                        # example: previous moves from None to node 1

            current = temperory        # move current forward to the node we saved earlier,
                                        # so we can repeat this process on it.
                                        # example: current moves from 1 to 2 (the value we stored
                                        # in temperory before we touched any pointers)

        return previous  