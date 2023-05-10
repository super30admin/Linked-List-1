class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummyNode = ListNode(0, next = head)
        L = dummyNode
        R = head
        distance = n
        while distance > 0 and R:
            R = R.next
            distance -= 1
        
        #move L and R ptrs so that when R reach eol then L reaches node to be deleted
        while R:
            L = L.next
            R = R.next
        
        #delete the node
        L.next = L.next.next
        return dummyNode.next