# TC: O(N) since we are traversing all the nodes of the Linked List
#   SC: O(1) since we are not using extra space.

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return
        
        prev = None
        curr = head
        nxt = head 
        
        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        
        return prev
