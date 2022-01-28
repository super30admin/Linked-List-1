# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr, ahead = head, head
        #move ahead n steps
        while n:
            ahead = ahead.next
            n-=1
        #remove head node
        if not ahead:
            return head.next
        prev = None
        #iterate till tail
        while ahead:
            prev = curr
            curr, ahead = curr.next, ahead.next

        # remove node
        if prev:  
            prev.next  = curr.next
        
        return head
        
    #Time complexity -O(n)
    #space complexity -O(1)