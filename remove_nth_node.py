
#Time Complexity: O(N).
#Auxiliary Space: O(1)
#Did this code successfully run on Leetcode :Yes

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
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        c =0 
        fast = dummy
        while(fast):
            fast=fast.next
            c+=1
            if c>n:
                break
        while(fast):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
            