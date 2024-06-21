'''
## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: No

'''

'''
Approach:
                    b
                 ________
     a          |        .meeting point
----------------|        |
                |________|
                     c
Assume a linked list with a cycle shown above where the slow and fast pointers meet at the meeting point
Slow has enteres the loop for the first time covering a distance of (a + b)
while fast as already completed one cycle of the loop covering a distance of (a + b + c + b)
Distance travelled by fast pointer = 2 * Distance travelled by slow pointer
a + b + c + b = 2 * (a + b)
a + b + c + b = 2a + 2b
a + c + 2b = 2a + 2b
c = a

Thus after the 2 pointers meet, we start one pointer again from the head
This time we keep them moving one step each and they will meet exactly at the point where the loop begins since a = c

'''

# Definition for singly-linked list.
# class ListNode:
#   def __init__(self, x):
#     self.val = x
#     self.next = None

class Solution:
  def detectCycle(self, head):
    # edge cases
    if not head or not head.next:
      return None

    # start with slow and fast pointer at head
    slow = head
    fast = head
    isCycle = False

    # at every step move slow by 1 node and fast by 2 nodes
    while fast and fast.next:
      slow = slow.next
      fast = fast.next.next

      # if slow and fast meet that means a cycle is detected
      if slow == fast:
        isCycle = True
        break

    if not isCycle:
      return None

    # start one pointer again from the head
    # and move them one node at a time
    # they will meet at the node where the cycle begins
    slow = head
    while slow != fast:
      slow = slow.next
      fast = fast.next

    return slow
