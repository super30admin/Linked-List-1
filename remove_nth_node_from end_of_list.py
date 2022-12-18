""" 
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Time Complexity: O(n)
Space Complexity: O(1)
"""

def removeNthFromEnd(head, n):
    
    if not head or not head.next:
        return None
    
    slow = head
    fast = head
    
    for i in range(n):
        fast = fast.next
        
    if not fast:
        return head.next
    
    while fast.next:
        slow = slow.next
        fast = fast.next
        
    slow.next = slow.next.next
    
    return head