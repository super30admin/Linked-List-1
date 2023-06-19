#Time Complexity: O(N)
#Space Complexity: O(N)
#Did It run in Leetcode: Yes
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode],
                         n: int) -> Optional[ListNode]:
        if (head == None):
            return None
        dummy = ListNode()
        dummy.val = 0
        dummy.next = head

        slow = dummy
        fast = dummy
        count = 0
        while (count != n):
            fast = fast.next
            count += 1

        while (fast.next != None):
            slow = slow.next
            fast = fast.next
        temp = slow
        slow.next = slow.next.next

        return dummy.next