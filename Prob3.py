#Time complexity: O(n)   
#Space complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

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
        slow,fast = head,head
        flag = False
        # move slow and fast pointer until they meet, if they meet, cycle
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        # by math: 2(a+b) = a+b+c+b ==> a=c
        # we bring one of the pointers back to the head and move both slowly
        #they meet at the head
        slow = head
        if flag is not True:
            return None
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow