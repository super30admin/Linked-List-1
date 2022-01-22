class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast=head
        slow=head
        
        for i in range(n):
            fast=fast.next
            
        if fast is None:
            return head.next
        
        
        
        while fast.next is not None:
            slow=slow.next
            fast=fast.next
        
        slow.next=slow.next.next
        return head

# Time complexity: O(n) as each element is traversed once in the linked list
# Space complexity: O(1) as we are not using any extra space, just two pointers