# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
This problem is solve by using two trackers, where fast moves at twice the speed of slow. If there is a cycle, then 
the fast and slow pointers will meet at some point. After which we set the fast pointer to the head and then move 
both pointers at the same speed. When they meet, that is the start of the cycle.  
"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None: return None

        fast = head
        slow = head

        hasCycle = False

        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                hasCycle = True
                break

        if hasCycle == False:
            return None

        fast = head
        while fast != slow:
            fast = fast.next
            slow = slow.next

        return slow