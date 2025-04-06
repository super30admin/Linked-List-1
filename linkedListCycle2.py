# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach:
# We observe that if we have a slow pointer travelling at 1x speed, and a fast pointer travelling at 2x speed, and if a cycle exists in the linked list, both these pointers will meet at some place.
# The head of the cycle will be at the same distance from the head of the linked list and the place where slow and fast pointers meet.
# We can simply traverse 2 pointers, 1 from the meeting place and 1 from the head, until they both meet again.

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head):
        slow, fast = head, head
        # flag will determine if a cycle was found or not
        flag = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            # If slow and fast meet each other, it indicates that there is a cycle, so we set flat to True
            if slow == fast:
                flag = True
                break

        # If the flag is true, we need to traverse the linked list, starting from head and meeting place at the same time
        if flag:
            slow = head
            while slow != fast:
                slow = slow.next
                fast = fast.next
            # When slow and fast meet again, we have reached the head of the cycle
            return slow
        # If there is no cycle we don't want to return anything
        return None