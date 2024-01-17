class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        first = head
        for i in range(n):
            first = first.next
            
        if not first:
            return head.next
        
        second = head
        while first.next:
            first = first.next
            second = second.next
            
        second.next = second.next.next
        return head

# Time complexity : O(N)
# Space complexity : O(1)
