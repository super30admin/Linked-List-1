'''
## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: No

'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
  def removeNthFromEnd(self, head, n):
    # start with fast and slow pointers at the head node
    slow = head
    fast = head

    # move fast pointer ahead by n nodes
    for i in range(n):
      fast = fast.next

    # if fast has reached null node, that means head node is to be removed
    if not fast:
      return head.next

    # move fast and slow pointers both by 1 node thus maintaining a distance of n
    while fast and fast.next:
      fast = fast.next
      slow = slow.next

    # when fast pointer reaches last node, slow pointer is 1 node behind the node to be removed
    slow.next = slow.next.next # remove the node by adjusting the next pointer of slow
    return head
