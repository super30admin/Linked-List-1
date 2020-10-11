"""
Time Complexity: O(N)
Space Complexity: O(1)
Accepted
"""
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #Iterative approach
        if head is None: return None
        previous = None
        curr = head
        nextNode = head.next
        
        while nextNode is not None:
            curr.next = previous
            previous = curr
            curr = nextNode
            nextNode = nextNode.next
        curr.next = previous
        head = curr
        return head