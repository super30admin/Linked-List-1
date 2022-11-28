# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        ## T.C = O(n)
        ## S.C = O(1)
        
        dummy = ListNode(-1)
        dummy.next = head
        
        count = 0
        s, f = dummy, dummy
        
        while count <= n:
            f = f.next
            count += 1

        while f:
            s = s.next
            f = f.next
        
        s.next = s.next.next
        return dummy.next