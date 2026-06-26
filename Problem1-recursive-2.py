## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Time Complexity: O(n)
        - We traverse each node in the linked list exactly once during the 
          recursive calls, where n is the number of nodes.
          
        Space Complexity: O(n)
        - The recursive approach requires space on the call stack proportional 
          to the maximum depth of the recursion, which is n levels deep.
        """
        
        # This will hold the reference to the new head of the fully reversed list 
        # (which is the last node of the original list).
        reversedHead = None
        
        def helper(head):
            nonlocal reversedHead
            
            # Base Case: If the list is empty or we've reached the last node.
            # We set 'reversedHead' to this last node and begin returning up the stack.
            if head is None or head.next is None:
                reversedHead = head
                return
            
            # Recursively travel to the very end of the list first.
            # This ensures we reverse from the tail backwards.
            helper(head.next)
            
            # --- Logic for reversing the current pair of nodes ---
            
            # 'temp' is the next node in the original list.
            temp = head.next
            
            # Clever trick: Because the deeper recursive call already processed 'temp',
            # it set 'temp.next' (which is head.next.next) to None. 
            # By assigning head.next = head.next.next, we are effectively setting 
            # head.next = None, ensuring the old forward pointer is broken.
            head.next = head.next.next
            
            # Reverse the pointer: make the next node point backwards to the current node.
            temp.next = head

        # Initiate the recursive traversal starting from the original head
        helper(head)
        
        # Return the new head that was captured during the base case of the recursion
        return reversedHead