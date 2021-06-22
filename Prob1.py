#Time complexity: O(n), one pass
#Space complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head
        
        prev,cur,fast = None,head,head.next
        # while loop till fast becomes None, cur becomes last element
        while fast is not None:
            # cur points to prev to reverse it
            cur.next = prev
            # make prev as cur
            prev = cur
            cur = fast
            #move fast
            fast = fast.next
        #the last is not done yet
        # for the last node reverse the connection and return
        cur.next = prev
        return cur