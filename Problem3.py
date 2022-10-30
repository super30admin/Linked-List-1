# Time Complexity - O(n)
# Space Complexity - O(1)
#Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fast = slow = head 
    
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                break
        
        if fast is None or fast.next is None:
            return None
        
        fast = head
        
        while fast != slow:
            fast = fast.next
            slow = slow.next
        
        return fast