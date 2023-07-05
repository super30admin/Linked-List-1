# Time Complexity : O(n)
# Space Complexity : O(1)

# The code ran on LeetCode

# Use slow and fast pointers to check if there is a cycle. Move the slow pointer to head and update each pointer by one step until they match. This node corresponds to the beginning of the cycle.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        flag = False
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
            
        if flag == False:
            return None
        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow