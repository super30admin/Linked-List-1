# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

'''
Time Complexity: O(n)
Space Complexity: O(1)
Approach:
We can use the Floyd's Cycle-Finding Algorithm (Tortoise and Hare algorithm) to detect a cycle in a linked list.
The idea is to use two pointers, one moving at twice the speed of the other. If there is a cycle, they will eventually meet. 
If there is no cycle, they will never meet.
'''

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                slow = head
                pos = -1
                while slow != fast:
                    pos += 1
                    slow = slow.next
                    fast = fast.next
                return slow

        return None
