#Time complexity: O(N)
#Space complexity: O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None or n == 0:
            return head
        
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy

        count = 0

        while count <= n:
            count += 1
            fast = fast.next

        while fast is not None:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return dummy.next
