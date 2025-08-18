class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: 'ListNode') -> 'ListNode':
        # Checking if the head is None, meaning the list is empty
        if head is None:
            return None

        slow = head
        fast = head
        flag = False

        # Using Floyd's Tortoise and Hare algorithm to detect a cycle
        # Moving slow pointer by one and fast pointer by two steps
        while fast.next is not None and fast.next.next is not None:
            slow = slow.next
            fast = fast.next.next

            # Checking if slow and fast pointers meet, indicating a cycle
            if slow == fast:
                flag = True
                break

        # If no cycle is detected, returning None
        if not flag:
            return None

        # Resetting slow to head and moving both pointers one step at a time
        # Finding the starting node of the cycle
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        # Returning the node where the cycle begins
        return slow

# Time Complexity (TC): O(n), where n is the number of nodes in the list
# Space Complexity (SC): O(1), using constant extra space
