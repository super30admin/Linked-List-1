#Linked List reversal
#time complexity : O(n) where n is the number of nodes
#space compliextiy :O(1)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev =None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev
            