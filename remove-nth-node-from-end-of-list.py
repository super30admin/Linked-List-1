# TC: O(n)
# SC: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        i = 0
        dummy = ListNode(-1)
        dummy.next = head
        slow, fast = dummy, dummy
        for i in range(0, n):
            fast = fast.next
    
        while fast.next:
            fast = fast.next
            slow = slow.next

        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        
        return dummy.next