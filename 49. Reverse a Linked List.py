# Definition for singly-linked list.
# Defining the ListNode class for singly-linked list nodes
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# Defining the Solution class with reverseList method
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Initializing current pointer to head and prev pointer to None
        current = head 
        prev = None 

        # Iterating through the list and reversing the links
        while current:
            temp = current.next      # Storing the next node
            current.next = prev      # Reversing the current node's pointer
            prev = current           # Moving prev to current node
            current = temp           # Advancing current to next node

        # Returning the new head of the reversed list
        return prev

# Time Complexity (TC): O(n), where n is the number of nodes in the linked list, since traversing each node once.
# Space Complexity (SC): O(1), since using only constant extra space for pointers.

        