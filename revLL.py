"""
Reverse LinkedList

 // Time Complexity : O(N
 // Space Complexity :O(1)
 // Did this code successfully run on Leetcode : yes
 // Any problem you faced while coding this : no
 """

class Solution(object):
      def reverseList(self, head):
          prev = None
          curr = head

          while curr:
              next = curr.next
              curr.next = prev
              prev = curr
              curr = next

          return prev
