# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if not head:
            return None
        
        dummynode  = ListNode(-1)
        dummynode.next = head
        
        slow,fast = dummynode,dummynode
        cnt = 0
        while cnt <=n:
            fast = fast.next
            cnt +=1
        
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        
        return dummynode.next
        
