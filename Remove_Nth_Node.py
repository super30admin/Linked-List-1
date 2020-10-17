# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # Two Pass Solution: Find the node length and Move the pointer till (length - n) from starting of node and Skip the current pointer next to remove the node.
        
        # One Pass: Maintain Slow and Fast Pointer. Move Fast Pointer to n steps.
        # Idea is to maintain n node in between slow and fast pointers so that when fast reaches the end node, slow pointer is at N-1 th node from end
        
        # Time Complexity: O(N)
        # Space Complexity: O(1)
        if head is None:
            return head
        slow = head
        fast = head
        counter = 0
        while counter < n and fast is not None:
            fast = fast.next
            counter += 1
        if fast is None:
            return head.next
        while fast.next is not None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return head
            
        
