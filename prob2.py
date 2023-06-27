# Time Complexity :O(n)
# Space Complexity :O(n)
# Leet Code: Yes

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummy = ListNode()
        dummy.next = head

        slow = fast = dummy
        
        while fast is not None:
            if n >= 0:
                fast = fast.next
                n -= 1
            else:
                slow = slow.next
                fast = fast.next

        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        return dummy.next