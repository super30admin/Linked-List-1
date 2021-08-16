"""
Time complexity: O(n)
Space complexity: O(1)
Approach: Maintain two pointers, fast and slow both pointing to head. While(slow != Fast)
        increment slow by one and fast by two. If they intersect, loop exists, else if either is None,
        loop does not exit. Once slow = fast, change slow = head and increment slow and fast by one till
        slow = fast and return slow when the loop ends.

"""
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return None
        else:
            slow, fast = head, head

            while (True):

                slow = slow.next
                if (fast and fast.next):
                    fast = fast.next.next
                else:
                    return None

                if (slow == fast):
                    break

            slow = head

            while (slow != fast and slow and fast):
                slow = slow.next
                fast = fast.next

            if not (slow and fast):
                return None

            return slow