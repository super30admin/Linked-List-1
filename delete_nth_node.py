'''
Time complexity :O(N)
Space complexity :O(1)
'''


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode()
        dummy.next = head
        first = dummy
        second = dummy
        
        
        for i in range(1,n+2):
            first = first.next
            
        while first!= None:
            first = first.next
            second = second.next
            
        second.next = second.next.next
        
        return dummy.next