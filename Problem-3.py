# Cycle in linked list
# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
#iterate one pointer 2x and other 1x and some point the pointer meet if there is a cycle, when pointers meet set the slow to head and iterate again and this time both pointers meet at the cycle node
#time - O(n)
#space - O(1)
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
        fast = head
        flag = False
        while(fast is not None and fast.next is not None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast: #cycle is detected when both pointers are pointed to same node
                flag = True
                break
        if not flag:
            return None
        slow = head # cycle is detected then set slow to head and iterate 1x
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
