
"""
Time complexity: O(n)
Space complexity: O(1)
Approach: Maintain fast and slow pointer at a distance of n + 1. Iterate over the Linked list,
        when fast == None, slow.next = slow.next.next. (Eliminate the next node for slow pointer.)
        return head.
"""
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return None
        else:
            fast = head
            slow = head
            n += 1
            while (n):
                if (fast):
                    fast = fast.next
                else:
                    head = head.next
                    return head
                n -= 1

            while (fast):
                fast = fast.next
                slow = slow.next

            slow.next = slow.next.next

            return head