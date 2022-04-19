# Time complexity -> O(n)
# Space complexity -> O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return head 
        
        dummy = ListNode()
        dummy.next = head
        slow = fast = dummy
        
        while fast.next:
            if n == 0:
                slow = slow.next
                fast = fast.next
            else:
                fast = fast.next
                n -= 1   
        slow.next = slow.next.next
        
        return dummy.next