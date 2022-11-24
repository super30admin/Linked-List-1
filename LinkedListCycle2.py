# Time Complexity : O(n/2 + n) = O(n) where n is the length of nodes in a list

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No Problems faced

# Your code here along with comments explaining your approach : 

# Using two pointer with different speed, here slow and fast, moving the fast pointer twice than slow. 
# If there is no cycle in this linked list, fast will finally run through entire list without meeting slow pointer.
# If there exists a cycle, they will meet each other at a node.

# defining a singly linked list
# class ListNode(object):
#      def __init__(self, x):
#           self.x = x
#           self.next = None

class Solution:
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # approach:
        # 1. Use two pointer with different speed and meet each other
        # 2. Put another pointer start from head
        # 3. The third pointer will finally meet slow at cycle start

        fast = slow = head

        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                curr = head
                while curr != slow:
                    slow = slow.next
                    curr = curr.next
                return slow
            

