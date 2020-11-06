"""
Time complexity O(N)
Space Complexity O(1)

"""

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy=ListNode(-1)
        dummy.next=head
        slow=fast=dummy
        for i in range(n+1):
            fast=fast.next
        while fast:
            slow=slow.next
            fast=fast.next
        
        slow.next=slow.next.next
        
        return dummy.next
        
        