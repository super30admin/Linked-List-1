#Time Complexity : O(n) - Visiting all nodes to reverse them
#Space Complexity : O(1) - Just storing the 3 pointers : prev,curr,nextt


def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
    prev = None
    curr = head
        
    while(curr != None):
        nextt = curr.next
        curr.next = prev
        prev = curr
        curr = nextt
    
    return prev