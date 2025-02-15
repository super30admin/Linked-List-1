# Time O(n)
# Space: O(1)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr != None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
            
        return prev

# Time: O(n) 
# Space: O(1)  
class Solution:
    headR = None
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None: return head
        last = self.reverse(head)
        last.next = None
        return self.headR

    def reverse(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head.next == None:
            self.headR = head
            return head
        rev = self.reverse(head.next)
        rev.next = head
        return head