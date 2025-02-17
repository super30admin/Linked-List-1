class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return None
        dummy = ListNode(-1)
        dummy.next = head
        count = 0
        slow = dummy
        fast = dummy
        while count <= n:
            fast = fast.next
            count += 1
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
        
# Time complexity - O(n)
# Space complexity - O(1)