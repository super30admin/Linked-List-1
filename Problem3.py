#  Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        slow = head 
        fast = None
        while fast != slow:
            if slow == head:
                fast = head
            if fast.next == None or fast.next.next == None:
                return None
            else:
                slow = slow.next
                fast = fast.next.next
        
        fast = head
        
        while fast != slow:
            fast = fast.next
            slow = slow.next
        return slow