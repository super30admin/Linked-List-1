# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        time complexity - O(N), N --> number of nodes in the linked list 
        space complexity - O(1)
        Detects the node where the cycle begins in a linked list.
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return None

        flag = False  # Flag to indicate if cycle is found
        slow = head  # Slow pointer moves one step at a time
        fast = head  # Fast pointer moves two steps at a time

        # Detect if a cycle exists in the linked list
        while fast is not None and fast.next is not None:
            slow = slow.next  # Move slow pointer one step
            fast = fast.next.next  # Move fast pointer two steps

            if slow == fast:  # Cycle detected
                flag = True
                break

        if not flag:
            return None  # No cycle found, return None

        # Reset slow pointer to the head and move both slow and fast pointers at the same pace
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow  # Return the node where the cycle begins
