'''
Problem: Linked List Cycle 2
Time Complexity: O(n), where n is given elements
Space Complexity: O(n), for hashmap
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        move slow pointer by 1x speed
        move fast pointer by 2x speed
        once they are equal, move slow to head and increment both pointer by 1x
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                slow = head
                while slow!=fast:
                    slow=slow.next
                    fast= fast.next
                return slow
        
        return None