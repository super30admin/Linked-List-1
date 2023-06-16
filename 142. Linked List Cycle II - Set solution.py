#Time Complexity: O(n)
#Space Complexity: O(n)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        is_seen = set()
        
        while head is not None:
            if head in is_seen:
                return head
            is_seen.add(head)
            head = head.next
        return None
                
