#Time Complexity: O(n)
#Space complexity: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        cnt = 0
        
        prev = ListNode(-1)
        prev.next = head
        fast = prev
        while cnt <= n:
            fast = fast.next
            cnt += 1
            
        slow = prev
        
        while fast is not None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        
        return prev.next
            
            
        
