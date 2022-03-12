class Solution:
    
    # Time Complexity - O(n)
    # Space Complexity - O(1)
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None:
            return head
        prev = None
        curr = head
        far = head.next
        while far!=None:
            curr.next = prev
            prev = curr
            curr = far
            far = far.next
        curr.next = prev
        return curr
    
    '''
    # Time Complexity - O(n)
    # Space Complexity - O(n)
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None: 
            return head
        temp = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return temp'''
