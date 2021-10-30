# Leetcode 206 - Reverse Linked List
# Space - O(1)
# Time - O(n)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head is None:
            return head
        
        prev = None
        curr = head
        
        while(curr != None):
            
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
       
        return prev
