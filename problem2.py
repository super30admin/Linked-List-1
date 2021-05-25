class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode()
        dummy.next = head
        slow = dummy
        fast = dummy
        i = 0
        while(i<n and fast.next!=None):
            fast = fast.next
            i = i + 1
        while(fast.next!=None):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
