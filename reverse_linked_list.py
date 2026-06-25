'''
Iterrative method:
time complexity: O(N)
space complexity: O(1)

Recursive method:
time complexity: O(N)
space complexity: O(N) 
'''
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    # iterative way
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or head.next:
            return head
        prev = None
        curr = head 
        next = None

        while curr:                         
            next  = curr.next               
            prev = curr.next 
            prev = curr
            curr = next
        return prev
    
    #recursive way
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        new_head = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return new_head
    






