# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Time Complexity: O(n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach:
            - Figure out whether it's a linked list cycle or not?
                - Use two pointer approach fast and slow
                - if fast and slow intersect, return flag = True (default flag = False)
            - if flag is False return None
            - assign slow to the head of the linked list and keep the fast at the intersection point 
                - now move the slow and fast at 1x speed and keep the loop running until they don't intersect
            - return the Node at which they intersect
        """        

        fast = head
        slow = head 
        flag = False
        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if not flag:
            return None
        slow = head
        while (slow != fast):
            slow = slow.next
            fast = fast.next
        return slow