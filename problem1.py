'''
## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

Time Complexity : O(n) for both the solutions
Space Complexity :
  1. In place using 3 pointers: O(1)
  2. Recursive solution: O(n) for recursive stack
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: No

'''

# Definition for singly-linked list.
# class ListNode:
#   def __init__(self, val=0, next=None):
#     self.val = val
#     self.next = next

#------------------Approach 1: Reverse the Linked List in place using 3 pointers------------------

class Solution1:
  def reverseList(self, head):
    previousNode = None
    currentNode = head
    while currentNode:
      nextNode = currentNode.next
      currentNode.next = previousNode
      previousNode = currentNode
      currentNode = nextNode
    return previousNode

#------------------Approach 2: Using recursion------------------

class Solution2:
  def reverseList(self, head):
    #base cases
    if not head:
      return None

    if not head.next:
      return head

    # logic
    reversedHead = self.reverseList(head.next) # recursively reverse the linked list exclusing the head node
    head.next.next = head # connect head node at the end
    head.next = None # make next of head node null
    return reversedHead
