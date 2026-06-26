# Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
# Time Complexity: O(n) 
# Space Complexity: O(1), only a few pointers used, no extra data structures
# Approach: Use two pointers, fast and slow, kept exactly (n+1) nodes apart.
# Move fast ahead first to create that gap, then move both together until fast falls off the end. 
#At that point, slow is sitting on the node just BEFORE the one we need to remove, so we can unlink it directly.
# A dummy node is placed before head so there's always a "previous" node to point from, even if the node being removed is the original head.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        dummy = ListNode(-1)        # create a fake node that sits before the real head
        dummy.next = head           # link dummy to the actual list

        fast = dummy                 # fast pointer starts at dummy
        slow = dummy                 # slow pointer also starts at dummy

        count = 0                    # tracks how many steps fast has taken so far
        while count <= n: # this loop runs (n+1) times total, building the gap between fast and slow
            fast = fast.next            # move fast forward by 1 node
            count += 1                  # record that fast took one more step
        
        while fast is not None: # keep moving both pointers together until fast runs off the end of the list
            slow = slow.next            # move slow forward by 1 node
            fast = fast.next            # move fast forward by 1 node (gap stays the same)
        
        # at this point, slow is on the node right BEFORE the one we want to delete

        temperory = slow.next        # save a reference to the node we are about to remove
        slow.next = slow.next.next   # skip over that node: point slow directly to the node AFTER it
                                      # the node being removed is now disconnected from the main list,
                                      # but it still has its OWN .next pointer left over, pointing
                                      # forward into the list (we haven't touched that yet)
        temperory.next = None        # now clean up that leftover pointer: set the removed
                                      # node's .next to None, so it doesn't dangle into the
                                      # rest of the list anymore. this doesn't change the
                                      # main list at all, it only cleans up the node we cut out

        return dummy.next             