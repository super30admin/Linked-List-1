# Time Complexity : O(n), n is no of nodes in the given list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# using two pointers - fast and slow
# the idea is that if there is a cycle in the given list, slow and fast will always meet
# then, if we have to find the head of the cycle, we unwind the fast pointer
# then increment both by 1, and we will see that they both will again meet at the cycle's head


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def __init__(self):
        self.iscycle = False

    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            # either empty list or single element list
            # means no cycle is possible
            return None
        
        slow = head
        fast = head
        # considering both even and odd lengths of the linked lists
        while (fast is not None and fast.next is not None):
            slow = slow.next 
            fast = fast.next.next
            if (slow == fast):
                self.iscycle = True
                break
        
        if not self.iscycle:
            return None
        

        # to find the head of the cycle in the linked list
        # unwind fast, and we will increment them both
        fast = head
        while (slow != fast):
            # this time they will meet at head
            fast = fast.next
            slow = slow.next
        
        return slow

        