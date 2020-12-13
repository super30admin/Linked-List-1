# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy=ListNode(-1)
        dummy.next=head
        start=dummy
        end=dummy
        #traverse till (n+1)th node from start to locate correctly the node
        for i in range(n+1):
            end = end.next
        #traverse both pointers in 1 pass 
        while end:
            end = end.next
            start = start.next
        extra=start.next
        #start points at previous node of future deletion node
        start.next = start.next.next
        #delete link between (4>5) >>>garbage collection
        if extra!=None:
            extra.next=None
        #as head changes we need to return constant dummy node's next
        return dummy.next
#O(N)
#O(1)