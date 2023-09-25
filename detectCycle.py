# Time Complexity: O(n)
# Space Complexity: O(1)

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
        slow, fast = head, head
        flag=False
        while(fast!=None and fast.next!=None):
            slow, fast = slow.next, fast.next.next
            if slow==fast:
                flag=True
                break

        if flag==False:
            return None

        fast=head
        while(slow!=fast):
            slow, fast = slow.next, fast.next

        return fast
