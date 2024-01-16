""" Explanation: Again, we use two pointers to find the node at which the cycle exists. The node at
    which the two pointers meet is the node where the cycle is at, since we will move the fast node
    twice as fast as the slow node. Once the cycle is found, we move the slow pointer back to head and
    check where the pointers meet since that would be the starting node of the cycle.
    Time Complexcity: O(n)
    Space Complexcity: O(1)
    TC's passed on LC: Yes
"""


# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # Step 1: Detect cycle using Floyd's Tortoise and Hare algorithm
        slow = fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                break
        else:
            # No cycle found
            return None

        # Step 2: Move one pointer back to the head
        slow = head

        # Step 3: Move both pointers one step at a time until they meet
        while slow != fast:
            slow = slow.next
            fast = fast.next

        # The meeting point is the start of the cycle
        return slow