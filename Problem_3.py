"""
Problem : 3

Time Complexity : O(n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Creating two pointer so as to find out if there exists a cycle in the linked list
if yes, then resetting the slow pointer and iterating all over again
the position where the slow and fast pointer meet will be the start of the cycle in the linked list

"""

# Linked list cycle II

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
        if head==None:
            return None
        slow=head
        fast=head
        # flag=False

        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                # flag=True
                break
        # if fast is null or fast.next is null means there is no cycle in the list
        if fast==None or fast.next==None:
            return None
        # if not flag:
        #     return None
        slow=head
        while slow!=fast:
            slow=slow.next
            fast=fast.next
        return slow


        

        