class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        flag=0

        slow,fast =head,head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow==fast:
                flag =1
                break
        if flag == 0:
            return

        slow=head
        while slow!=fast:
            slow=slow.next
            fast=fast.next
        return slow
