#
# Time Complexity = O(n)
# Space Complexity = O(1)
#
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                break

        if fast == None or fast.next == None:
            return None
        else:
            while fast != head:
                head = head.next
                fast = fast.next
        return head
