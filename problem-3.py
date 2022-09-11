#Time Complexity: O(n)
#Space complexity: O(1)
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return None
        slow,fast=head,head #Slow pointer and fast pointer
        #iterate through the list until slow and fast pointers meet.
        while fast and fast.next:
            fast=fast.next.next
            slow=slow.next
            if slow==fast:
                break
        else:
            return None
        curr=head
        # Now iterate through the head to find the exact node it is making cycle with.
        while curr!=slow:
            curr=curr.next
            slow=slow.next
        return curr