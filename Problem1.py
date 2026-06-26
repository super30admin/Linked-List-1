## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Time Complexity: O(n)
        - Where n is the number of nodes in the linked list. We traverse the list exactly once.
        
        Space Complexity: O(1)
        - We only use a constant amount of extra space for the pointers (prev, current, temp), 
          regardless of the size of the linked list.
        """
        
        # 'prev' will keep track of the previous node. 
        # It starts as None because the new tail of the reversed list must point to None.
        prev = None
        
        # 'current' starts at the head and is used to traverse the original list.
        current = head
        
        # Loop until we reach the end of the list
        while current is not None:
            # 1. Store the next node temporarily so we don't lose the rest of the list 
            #    when we break the current link.
            temp = current.next
            
            # 2. Reverse the current node's pointer to point backwards to the 'prev' node.
            current.next = prev
            
            # 3. Move the 'prev' pointer one step forward to the 'current' node.
            prev = current
            
            # 4. Move the 'current' pointer one step forward to the 'temp' node we saved earlier.
            current = temp
            
        # Once the loop finishes, 'current' will be None, and 'prev' will be resting 
        # on the last node we processed, which is the new head of the reversed list.
        return prev