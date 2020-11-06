"""
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
As we want to return nth node from the very last, we traverse from head and go upto n nodes. This is done 
so as to create a gap of n nodes between slow and fast pointer. After the fast pointer reaches its destination,
we place a slow pointer in the beginning and start traversing both the pointers through the list till
the fast pointer reaches None. At that point, slow would be a node before the node that we want to delete.
So, we would just adjust the next pointer of slow to slow.next.next. This would just remove that nth node
from the list. Also, we have maintained a dummy pointer in the very beginning so as to help us in 
edge cases like when we have only one node.
"""
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution(object):
    def removeNthFromEnd(self, head, n):
        if not head:
            return head
        dummy = ListNode(-1)
        dummy.next = head
        fast = ListNode()
        slow = ListNode()
        fast = dummy
        slow = dummy
        while n >= 0:
            fast = fast.next
            n -= 1
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
