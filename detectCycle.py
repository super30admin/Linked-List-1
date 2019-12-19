# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Edge cases of if fast is None or fast.next is None: return None

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
        if head is None:
            return None
        slow = head
        fast = head.next
        while slow != fast:
            if fast is None or fast.next is None:
                return None
            slow = slow.next
            fast = fast.next.next
            
        curr = head
        fast = fast.next
        while curr != fast:
            fast = fast.next
            curr= curr.next
        return fast
            
        