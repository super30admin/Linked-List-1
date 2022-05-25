#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        curr = head
        while curr:
            count += 1
            curr = curr.next
        length = count - n
        curr = head
        i = 0
        if length==0:
            return head.next
        while i<length-1:
            curr = curr.next
            i+=1
        curr.next=curr.next.next    
        return head
