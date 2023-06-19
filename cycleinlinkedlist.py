#Time Complexity: O(N)
#Space Complexity: O(1)
#Did It run in Leetcode: Yes


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if (head == None or head.next == None):
            return None
        slow = head
        fast = head
        res = False

        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if (slow == fast):
                res = True
                break
        if (res == False):
            return None
        slow = head
        while (slow != fast):
            slow = slow.next
            fast = fast.next
        return slow