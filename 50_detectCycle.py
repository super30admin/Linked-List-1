# Accepted in leetcode(142)
# time - O(N), space - O(1)
# we will iterate the list twice using slow and fast pointers, first iteration to find if there is a cycle in the list and second iteration to get the start position by reseting the slow pointer to head.

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # edge case
        if head is None or head.next is None:
            return None
        # eclare 2 pointers and a flag
        slow = head
        fast = head
        flag = False
        # first iteration to detect the loop
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break;
        # no loop return None
        if not flag: return None
        # found loop reset slow
        slow = head
        # second loop to detect start position of the loop
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return fast