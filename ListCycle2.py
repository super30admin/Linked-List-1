'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Slow and Fast Pointers approach.
'''
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        cycle_found = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                cycle_found = True
                break

        if not cycle_found:
            return None

        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
