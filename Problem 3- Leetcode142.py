#Time Complexity: O(n)
#Space Complexity: O(1)

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
        slow, fast = head, head

        while fast is not None and fast.next is not None:
            slow, fast = slow.next, fast.next.next
            if slow == fast: break
        else: return None

        slow = head
        while slow != fast:
            slow, fast = slow.next, fast.next

        return slow
        