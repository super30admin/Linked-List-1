# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

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
        # setting slow and fast pointer to head
        slow = head
        fast = head

        flag = 0  # flag to set back the head

        # base case
        if head == None or head.next == None:
            return None

        # run a loop till the while condition turns true
        while fast != None and fast.next != None:

            slow = slow.next  # increment slow pointer at 1x position
            fast = fast.next.next  # increment fast pointer at 2x position

            if slow == fast:
                flag = 1  # reset the fast pointer to head
                break

        if flag == 1:
            fast = head

            # run till the condition turns true
            while fast != slow:

                slow = slow.next  # increment slow pointer at 1x position
                fast = fast.next  # increment fast pointer at 1x position

            return fast

        else:
            return None
