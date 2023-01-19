#Time Complexity: O(n)
#Space Complexity: O(1)
#Successfully ran on leetcode
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        fast = dummy
        slow = dummy
        count = 0
        while count<=n:
            fast = fast.next
            count+=1
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next