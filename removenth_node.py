"Time Complexity is O(N)"
"Space Complexity is O(1)"

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy

        for _ in range(n+1):
            fast = fast.next

        
        while(fast):
            slow = slow.next 
            fast = fast.next

        
        slow.next = slow.next.next

        return dummy.next
