class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        
        while head:
            temp = head.next
            head.next = prev
            prev = head
            head = temp
        
        return prev
        
        
        #tc o(n)
        #sc o(1)
        
