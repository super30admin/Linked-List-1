# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None: return None
        dummy = ListNode(-1,head)
        count = 0
        slow = dummy
        fast = dummy
        
        while(count <= n):
            fast = fast.next
            count += 1
        
        while fast != None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        return dummy.next