"""
Given the head of a linked list, return the node where the cycle begins. 
If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that 
can be reached again by continuously following the next pointer. Internally, 
pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). 
It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

"""

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No


from typing import List

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        #null case
        if head == None:
            return None
        
        # using 2 pointers, slow and fast. Initially setting both to head
        slow = head
        fast = head

        # Setting a flag to initial false value
        flag = False

        # as long as fast or fast.next has not reached the end
        # fast pointer moves fast, slow moves slow
        while(fast != None and fast.next != None):
            fast = fast.next.next
            slow = slow.next

            # as soon as they intersect, flag becomes true
            # need to break and move fast pointer to the the start
            
            if fast == slow:
                flag = True
                break

        if flag == False:
            return None
        else:
            fast = head
        
        # Once fast moves to to the head (start) both pointers move at same slow speed
        while(fast != slow):
            fast = fast.next
            slow = slow.next

        # in the end, when fast and slow inersect again, we can return either values
        # slow/fast in the end will always point to the node where cycle begins
        return slow




        
        