## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        """
        Time Complexity: O(L) 
        where L is the number of nodes in the linked list. The algorithm makes a 
        single pass through the list with the 'fast' pointer.
        
        Space Complexity: O(1) 
        because we only use a constant amount of extra space for the dummy, slow, 
        fast, and temp pointers, regardless of the list size.
        """
        
        # 1. Create a dummy node that points to the head.
        # This simplifies edge cases, such as when the list has only one node 
        # or when we need to remove the very first node in the list.
        dummy = ListNode()
        dummy.next = head

        # 2. Initialize two pointers (slow and fast), both starting at the dummy node.
        slow = dummy
        fast = dummy
        count = 0
        
        # 3. Move the fast pointer forward by n + 1 steps.
        # This creates a gap of exactly 'n' nodes between the slow and fast pointers.
        while count <= n:
            fast = fast.next
            count += 1

        # 4. Move both pointers at the same pace until 'fast' reaches the end.
        # Because we maintained the gap of 'n' nodes, when 'fast' falls off the end 
        # (becomes None), 'slow' will land exactly on the node right BEFORE the one 
        # we need to remove.
        while fast is not None:
            slow = slow.next
            fast = fast.next

        # 5. Remove the nth node from the end.
        # 'slow.next' is the node we want to remove. We store it in 'temp'.
        temp = slow.next
        
        # Reroute the pointer to skip the target node entirely.
        slow.next = slow.next.next
        
        # Detach the removed node's next pointer to cleanly remove it from the list.
        temp.next = None

        # 6. Return the head of the modified list (which is the node after dummy).
        return dummy.next