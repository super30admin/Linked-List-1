class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head

        reversedl = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversedl
