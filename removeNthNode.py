class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #create dummy node
        dummyNode = ListNode()
        dummyNode.val = -1
        dummyNode.next = head
        
        slow = dummyNode
        fast = dummyNode
        #dummy node's next node is the head node.
        #start traversing the fast node
        count = 0
        while(count < n):
            fast = fast.next
            count += 1
        
        
        
        while(fast.next != None):
            slow = slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        return dummyNode.next