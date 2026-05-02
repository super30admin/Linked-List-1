# O(n) time, O(1) space
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0,head)
        right = dummy
        left = dummy 

        for i in range(n):
            right = right.next 


        while right.next:
            left = left.next 
            right = right.next 

        left.next = left.next.next 
        
        return dummy.next 