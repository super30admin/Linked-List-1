class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=head
        fast=head
        flag=False
        while fast!=None  and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                flag=True
                break
        if not flag:
            return None
        slow=head
        while slow!=fast:
            slow=slow.next
            fast=fast.next
        return fast
#Time-Complexity- O(N)
#Space-Complexity:O(1)