# https://leetcode.com/problems/linked-list-cycle-ii/
# Time complexity: O(n)
# Space complexity: O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head,head
        while fast and fast.next:
            slow,fast = slow.next, fast.next.next
            if slow ==fast: # Using Floyd's Tortoise and Hare algorithm to find the start of the cycle 
                break
        else: # If no cycle is detected
            return None
        # To find the start of the cycle, we reset one pointer to the head and move both pointers one step at a time and since they are at the same distance from the start of the cycle, they will meet at the start of the cycle
        while head!=slow:
            head,slow = head.next, slow.next
        return head #or slow, both are the start of the cycle
        