class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None:
            return None

        prev = None
        cur =head
        while cur:
            temp = cur.next
            cur.next=prev
            prev=cur
            cur=temp

        head = prev

        return head
