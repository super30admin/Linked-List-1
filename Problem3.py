# https://leetcode.com/problems/linked-list-cycle-ii/

# Time Complexity: O(n)
# Space Complexity: 

# This problem is to detect if a cycle exists in a singly linked list. We implement using slow and fast pointers. 
# We first move slow by 1x and fast by 2x. If there is a cycle, then at some point fast and slow meet. 
# If they don't meet, then we return null. Once we know the meeting point. We now assign the slow pointer to the head of the linked list. 
# Slow and fast pointer both move at 1x. They will surely meet at the start node of the cycle, although the fast pointer will have some amount
# cyclical movements while the slow is approaching the cycle's start node point.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        slow = head
        fast = head
        flag = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break

        if not flag:
            return None

        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow