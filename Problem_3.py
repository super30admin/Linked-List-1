"""
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
This algorithm for detecting cycles is called Floyd's algorithms or Tortoise and Hare algorithm. We set a 
slow and a fast pointer on  head and start moving them with different speeds. If they meet, that means, 
there is a cycle, if the fast hits None, there is no cycle. Now to return the point of start of the cycle,
we put place one of the pointers back to the head and start iterating both of them at the same speed
until they meet each other. The point where they meet is the start of the cycle.
"""
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution(object):
    def detectCycle(self, head):
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break
        else:
            return None

        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
