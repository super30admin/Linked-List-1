# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach: 3 steps to solve the problem:
#     - Check for a cycle using Floyd's algorithm
#     - If a cycle is found, find it's length (comments inline)
#     - Use the length to find cycle starty (comments inline)
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None

        slow = head
        fast = head
        cycle_length = 0
        current = None

        # Use Floyd's Algorithm to detect a cycle
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

            if fast == slow:
                current = slow
                # Cycle Exists, calculate length
                break
        if current == None:
            return None  # No Cycle

        # Now, to find the cycle length -
        # Anchor the node where fast and slow meet - This would be a node in the cycle
        # Advance the pointer one step at a time and increment cycle length
        # When the meet again, break
        while True:
            current = current.next
            cycle_length += 1
            if current == fast:
                break

        # Find Start
        pointer1 = head
        pointer2 = head

        # Move pointer2 by cycle_length
        for _ in range(cycle_length):
            pointer2 = pointer2.next

        while pointer1 != pointer2:
            pointer1 = pointer1.next
            pointer2 = pointer2.next

        return pointer2