class Solution:
    '''
    Time Complexity: O(n)
    Space Complexity: O(n)
    '''
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head
        
        new_tail = head
        
        while new_tail.next:
            current = new_tail.next
            new_tail.next = current.next
            current.next = head
            head = current
        
        return head