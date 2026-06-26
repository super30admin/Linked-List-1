# Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
# Time Complexity: O(n), each pointer visits a bounded number of nodes
# Space Complexity: O(1), only a few pointers used, no extra data structures
# Approach: Use slow (1 step) and fast (2 steps) pointers to detect if a cycle exists. 
#If they meet, reset slow to head and move both 1 step at a time and they will meet again exactly at the start of the cycle.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        

        if head is None:                         # empty list has no nodes, so no cycle is possible
            return None
        
        slow = head                             # slow pointer starts at the first node
        fast = head                             # fast pointer also starts at the first node
        flag = False                            # tracks whether we found a cycle or not

        while fast.next is not None and fast.next.next is not None:
                                 # stop if fast would hit the end of the list (no cycle case) for both even and odd lengths
            slow = slow.next                # move slow forward by 1 node
            fast = fast.next.next           # move fast forward by 2 nodes

            if fast == slow:             # if they land on the same node, a cycle exists
                flag = True              # mark that a cycle was found
                break                    # no need to keep looping, exit now

        if not flag:                     # loop ended naturally (fast hit the end) = no cycle
                return None              # so there's no cycle start to return

        slow = head                      # reset slow back to the beginning of the list
        while slow != fast:              # fast stays at the meeting point from before
            slow = slow.next             # move slow forward by 1 node
            fast = fast.next             # move fast forward by 1 node (same speed now)
        return slow                      # both pointers now point to the cycle's starting node