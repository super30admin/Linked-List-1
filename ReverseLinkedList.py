#Time Complexity : O(n)
#Space Complexity : O(1)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        previous = None
        while curr:
            temp = curr.next
            curr.next = previous
            previous = curr
            curr = temp
        return previous
        
