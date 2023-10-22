# Intuition 1: Brute Force
# Traverse through the LL and keep a track of each nodes memory address in a hashset. If you come across a node and find its memory address already existing in the set, return that as the ans.
# TC: O(n) SC: O(n) for the hashset, n # of nodes

# Intuition 2: Using slow and fast ptrs
# Initialize slow and fast ptrs at head, where slow = x1 speed & fast = x2 speed. If they meet, there is a cycle. In that case, reset slow or fast to head and keep the other as-is. Move them both at x1 speed, whereever they meet = head of the cycle.
# TC: O(n) SC: O(1)

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        slow = head
        fast = head
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                slow = head
                while slow.next != None and slow != fast:
                    slow = slow.next
                    fast = fast.next
                return slow

        return None
