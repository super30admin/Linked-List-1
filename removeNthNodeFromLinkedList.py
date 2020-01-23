# Time complexity: O(N)
# Space complexity: O(1)

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0)
        dummy.next = head
        
        fast = dummy
        slow = dummy
        count = 0
        while count < n:
            fast = fast.next
            count += 1
        while fast.next is not None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        
        return dummy.next