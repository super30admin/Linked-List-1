## Problem1 (https://leetcode.com/problems/reverse-linked-list/)# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Time Complexity: O(n)
        - We traverse each node in the linked list exactly once, where n is the 
          number of nodes in the list.
          
        Space Complexity: O(n)
        - Since this is a recursive approach, the space complexity is proportional 
          to the maximum depth of the recursion stack. The recursion goes n levels 
          deep (one for each node), requiring O(n) extra space.
        """
        def helper(current, prev):
            # Base Case: When 'current' becomes None, we've reached the end of 
            # the original list. 'prev' is now resting on the last node processed, 
            # which is the new head of the fully reversed list.
            if current is None:
                return prev
            
            # 1. Temporarily store the next node so we don't lose the rest of the list
            temp = current.next
            
            # 2. Reverse the link: point the current node backwards to the 'prev' node
            current.next = prev
            
            # 3. Shift 'prev' forward to the current node for the next step
            prev = current
            
            # 4. Shift 'current' forward to the original next node (saved in temp)
            current = temp
            
            # 5. Make the recursive call to process the next node in the list
            #    Crucially, we return the result of this call so the new head 
            #    bubbles all the way back up to the top.
            return helper(current, prev)
            
        # Start the recursion with 'current' at the head, and 'prev' as None 
        # (since the new tail must point to None).
        return helper(head, None)