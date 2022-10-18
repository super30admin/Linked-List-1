'''
Time Complexity: O(N)
Space Complexity: O(1)
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode()
        dummy.next = head
        slow = fast = dummy
        count = 0
        while(count<=n and fast):
            fast = fast.next
            count += 1
        while(fast):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
