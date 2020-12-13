# Linked List Cycle II

# Time Complexity :  O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes with Runtime: 44 ms and Memory Usage: 17.4 MB 
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach : 
"""
Using two pinters approach, slow and fast poiniting to head and a boolean variable
initialized to false If cycle is not found return None else get start node
and move slow to head and start traversing one step for both pointers till they are equal 
which is start point. This is also called Hare and Tortoise Approach where fast is
hare and slow is tortoise.

"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if(head==None): # Edge Case
            return head
        slow=head
        fast=head
        hasCycle=False
        while(fast is not None and fast.next is not None):
            slow=slow.next
            fast=fast.next.next
            if(slow==fast):
                hasCycle=True
                break
        if(not hasCycle):
                return None
        else:
            slow=head
            while(slow is not fast):
                slow=slow.next
                fast=fast.next
            return slow