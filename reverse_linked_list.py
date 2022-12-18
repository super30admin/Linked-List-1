""" 
Given the head of a singly linked list, reverse the list, and return the reversed list.

Time Complexity: O(n)
Space Complexity: O(1)
"""

def reverseList(head):
    
    if not head or not head.next:
        return head
    
    prev = None
    curr = head
    fast = head.next
    
    while fast:
        curr.next = prev
        prev = curr
        curr = fast
        fast = fast.next
        
    curr.next = prev
    
    return curr